package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "wholesale_order")
public class WholeSaleOrder {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "purchase_order_num")
    private String purchaseOrderNum;

    @Column(name = "terms")
    private String terms;

//    @Column(name = "customer_id")
    @ManyToOne
    @JoinColumn(name = "customer_id") // foreign key
    private Customer customerId;
//    private int customerId;

//    @Column(name = "product_id")
    @ManyToOne
    @JoinColumn(name = "product_id") // foreign key
    private Product productId;
//    private int productId;

    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

    @Column(name = "shipped_date")
    private LocalDateTime shippedDate;
}
