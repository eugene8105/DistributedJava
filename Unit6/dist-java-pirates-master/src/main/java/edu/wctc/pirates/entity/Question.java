package edu.wctc.pirates.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Question {
    @Id
    @Column(name = "question_id")
    private int id;

    private String text;

    @OneToMany
    @JoinColumn(name = "question_id")
    private List<Answer> answerList;
}
