package edu.wctc.pirates.service;

import edu.wctc.pirates.entity.Answer;
import edu.wctc.pirates.entity.CrewTraining;
import edu.wctc.pirates.entity.Question;
import edu.wctc.pirates.entity.Training;
import edu.wctc.pirates.repo.CrewTrainingRepository;
import edu.wctc.pirates.repo.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class BasicTrainingService implements TrainingService {
    @Autowired
    private TrainingRepository trainingRepository;

    @Autowired
    private CrewTrainingRepository crewTrainingRepository;

    @Autowired
    private CrewService crewService;

    private int getParam(String name, Map<String, String[]> params) {
        if (params.containsKey(name)) {
            String[] vals = params.get(name);
            if (vals.length >= 1) {
                try {
                    return Integer.parseInt(vals[0]);
                } catch (Exception e) {
                }
            }
        }

        return 0;
    }

    @Override
    public Training getTraining(int trainingId) {
        Optional<Training> training = trainingRepository.findById(trainingId);
        if (training.isPresent())
            return training.get();
        return null;
    }

    @Override
    @Transactional
    public boolean gradeTraining(String username, Map<String, String[]> params) {
        boolean passed = true;

        Training training = getTraining(getParam("trainingId", params));

        if (training == null) return false;

        for (Question q : training.getQuestionList()) {
            // Question ID is name of buttons in group
            int paramVal = getParam(Integer.toString(q.getId()), params);
            // A question had no answer
            if (paramVal == 0)
                passed = false;
            // Find correct answer from database object
            for (Answer a : q.getAnswerList()) {
                if (a.isCorrect() && paramVal != a.getId())
                    passed = false;
            }
        }

        // Delete any previous training record
        int crewId = crewService.getCrewMemberId(username);
        crewTrainingRepository.deleteCrewTrainingsByCrewId(crewId);

        // Create a new one if they passed
        if (passed) {
            CrewTraining crewTraining = new CrewTraining();
            crewTraining.setCrewId(crewId);
            crewTraining.setTrainingId(training.getId());
            crewTraining.setCompleted(true);
            crewTrainingRepository.save(crewTraining);
        }

        return passed;
    }
}
