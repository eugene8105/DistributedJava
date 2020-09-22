package edu.wctc.pirates.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
public class Crew {
    @Id
    @Column(name = "crew_id")
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToMany
    @JoinColumn(name = "crew_id")
    private List<TrainingStatus> trainingStatusList;

    private String username;
}
