package org.example.behavioural.strategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double apply(OrderContext orderContext) {
        return orderContext.getAmount();
    }
}
