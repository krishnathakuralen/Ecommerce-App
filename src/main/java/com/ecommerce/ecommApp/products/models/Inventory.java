package com.ecommerce.ecommApp.products.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@NoArgsConstructor
public class Inventory {

    @Id
    @Column(name = "InventoryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long InventoryID;

    @Column(name = "availabilityCount")
    private int available;

    @Column(name = "size")
    private String size;

    @Column(name = "cost")
    private int cost;

    @Override
    public String toString() {
        return "Inventory{" +
                "available=" + available +
                ", size='" + size + '\'' +
                ", cost=" + cost +
                '}';
    }
}
