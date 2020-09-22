package edu.wctc.pirates.repo;

import edu.wctc.pirates.entity.Training;
import org.springframework.data.repository.CrudRepository;

public interface TrainingRepository extends CrudRepository<Training, Integer> {
}
