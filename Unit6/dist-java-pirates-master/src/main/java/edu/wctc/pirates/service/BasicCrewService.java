package edu.wctc.pirates.service;

import edu.wctc.pirates.entity.Crew;
import edu.wctc.pirates.repo.CrewRepository;
import edu.wctc.pirates.repo.CrewTrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BasicCrewService implements CrewService {
    @Autowired
    private CrewRepository crewRepository;

    @Autowired
    private CrewTrainingRepository trainingCompletionRepository;

    @Override
    public List<Crew> getAllCrewMembers() {
        List<Crew> list = new ArrayList<>();
        crewRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Crew getCrewMember(String username) {
        Optional<Crew> resultC = crewRepository.findByUsername(username);
        if (resultC.isPresent())
            return resultC.get();
        return null;
    }

    @Override
    public int getCrewMemberId(String username) {
        Optional<Crew> aCrew = crewRepository.findByUsername(username);
        if (aCrew.isPresent())
            return aCrew.get().getId();
        return 0;
    }
}
