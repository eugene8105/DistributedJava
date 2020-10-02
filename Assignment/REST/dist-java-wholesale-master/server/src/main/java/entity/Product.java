package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class Product {
    @Column(name = "product")
    @Id
    private int product_id;

    private double cost;
}
