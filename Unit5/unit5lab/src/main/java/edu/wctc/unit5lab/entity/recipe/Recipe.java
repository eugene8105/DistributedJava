package edu.wctc.unit5lab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "RECIPE")
public class Recipe {
    @Id
    @Column(name = "recipe_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "recipe_chef_id")
    private int chefId;

    @Column(name = "recipe_title")
    private String Title;

    @Column(name = "recipe_description")
    private String description;

}
