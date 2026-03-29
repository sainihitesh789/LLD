package org.example.behavioural.strategy;

public class LoyaltyDiscount implements DiscountStrategy {
    @Override
    public double apply(OrderContext orderContext) {
        return orderContext.getUserType().contains("GOLD") ?
                orderContext.getAmount() * 0.85:
                orderContext.getAmount();
    }
}
