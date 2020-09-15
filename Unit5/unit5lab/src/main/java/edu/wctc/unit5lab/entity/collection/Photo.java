package edu.wctc.unit5lab.entity.collection;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "PHOTO")
public class Photo {

    @Id
    @Column(name = "phote_id")
    private int id;

    @ManyToOne
    private Collector collectorId;

    @Column(name = "phote_filename")
    private String fileName;

    @Column(name = "datestamp")
    private LocalDateTime dateStamp;

    @Column(name = "visible")
    private int visible;

}
