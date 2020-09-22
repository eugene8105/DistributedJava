package edu.wctc.pirates.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Answer {
    @Id
    @Column(name = "answer_id")
    private int id;

    private String text;

    @Column(name = "is_correct")
    private boolean isCorrect;
}
