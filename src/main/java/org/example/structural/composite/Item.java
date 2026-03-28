package org.example.structural.composite;

import org.example.structural.decorator.Product;

public class Item implements Product {
    double price;
    String description;
    public Item(double price, String description){
        this.description = description;
        this.price = price;
    }
    @Override
    public String description() {
        return description;
    }
    @Override
    public double price() {
        return price;
    }
}
