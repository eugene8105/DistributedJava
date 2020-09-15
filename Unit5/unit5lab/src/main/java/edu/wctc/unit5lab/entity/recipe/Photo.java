package edu.wctc.unit5lab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "PHOTO")
public class Photo {
    @Id
    @Column(name = "phote_id")
    private int id;

    @ManyToOne
    @Column(name = "photo_recipe_id")
    private Recipe recipeId;

    @Column(name = "photo_filename")
    private String fileName;

    @Column(name = "phote_caption")
    private String captionBy;

    @Column(name = "photo_datestamp")
    private LocalDateTime dateStamp;

    @Column(name = "photo_visible")
    private int visible;
}
