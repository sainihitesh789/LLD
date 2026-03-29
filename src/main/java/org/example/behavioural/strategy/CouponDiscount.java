package org.example.behavioural.strategy;

public class CouponDiscount implements DiscountStrategy {
    @Override
    public double apply(OrderContext orderContext) {
        return orderContext.getCoupon().contains("SAVE10")?
                orderContext.getAmount() * 0.90 :
                orderContext.getAmount();
    }
}
