package edu.wctc.pirates.service;

import edu.wctc.pirates.entity.Training;

import java.util.Map;

public interface TrainingService {
    Training getTraining(int trainingId);

    boolean gradeTraining(String username, Map<String, String[]> params);
}
