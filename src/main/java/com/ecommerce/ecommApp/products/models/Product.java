package com.ecommerce.ecommApp.products.models;

import lombok.Getter;

import javax.persistence.*;

@Table
public class Product {
  @Getter @Id @Column(unique = true)
  int ProductID;

  public enum Gender {MALE, FEMALE};

  @Getter @Column
  Gender gender;

  @Getter
  String type;

  @Getter
  int InventoryID;
}
