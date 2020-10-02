package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Customer {

    @Column(name = "customer")
    @Id
    private int customer_id;

}
