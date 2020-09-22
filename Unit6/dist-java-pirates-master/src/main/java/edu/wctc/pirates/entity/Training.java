package edu.wctc.pirates.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Training {
    @Id
    @Column(name = "training_id")
    private int id;

    private String name;

    @OneToMany
    @JoinColumn(name = "training_id")
    private List<Question> questionList;
}
