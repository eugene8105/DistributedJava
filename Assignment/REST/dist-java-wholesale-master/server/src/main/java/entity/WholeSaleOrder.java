package entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "wholesale_order")
public class WholeSaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auto_increment;

    private String purchaseOrderNum;

    private String terms;

    private int customerId;

    private int productId;

    private LocalDate purchaseDate;
}
