package edu.wctc.pirates.repo;

import edu.wctc.pirates.entity.CrewTraining;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CrewTrainingRepository extends CrudRepository<CrewTraining, Integer> {
    Optional<CrewTraining> findByCrewIdAndTrainingId(int crewId, int trainingId);

    void deleteCrewTrainingsByCrewId(int crewId);
}
