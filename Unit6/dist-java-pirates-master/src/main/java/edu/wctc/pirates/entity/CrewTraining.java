package edu.wctc.pirates.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "crew_training")
public class CrewTraining {
    @Id
    @Column(name = "crew_training_id")
    private int id;

    @Column(name="training_id")
    private int trainingId;

    @Column(name="crew_id")
    private int crewId;

    @Column(name = "is_complete")
    private boolean completed;

}
