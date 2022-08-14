package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers1")
public class Customer {
    @Id
    @GeneratedValue
    public int id;
    public String custName;
    public String itemName;

    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", custName='" + custName + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String custName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String itemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
