package org.example.behavioural.strategy;

public interface DiscountStrategy {
    double apply(OrderContext orderContext);
}
