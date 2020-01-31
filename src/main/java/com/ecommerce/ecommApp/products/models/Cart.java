package com.ecommerce.ecommApp.products.models;
import lombok.Getter;
import lombok.Setter;



import javax.persistence.*;
@Getter
@Setter
@Table
public class Cart {

    private Long ProductID;

    private Long CustomerID;

    @Id
    @Column(name = "CartID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CartID;


    @Override
    public String toString() {
        return "Cart{" +
                "ProductID=" + ProductID +
                ", CustomerID=" + CustomerID +
                ", CartID=" + CartID +
                '}';
    }
}
