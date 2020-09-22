package edu.wctc.pirates.repo;

import edu.wctc.pirates.entity.Crew;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CrewRepository extends CrudRepository<Crew, Integer> {
    Optional<Crew> findByUsername(String username);
}
