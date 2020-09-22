package edu.wctc.pirates.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Position {
    @Id
    @Column(name = "position_id")
    private int id;

    private String name;

    private String description;

}
