package edu.wctc.pirates.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Immutable
@Entity
@Table(name="v_training_status")
@Data
@NoArgsConstructor
public class TrainingStatus {
    @Id
    @Column(name="training_id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name = "is_complete")
    private boolean completed;
}
