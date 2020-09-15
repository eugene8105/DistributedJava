package edu.wctc.unit5lab.entity.collection;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "collector")
public class Collector {
    @Id
    @Column(name = "collector_id")
    private int id;

    @Column(name = "collector_firstname")
    private String firstName;

    @Column(name = "collector_lastname")
    private String lastName;

    @Column(name = "collector_avatar")
    private String avatar;
}
