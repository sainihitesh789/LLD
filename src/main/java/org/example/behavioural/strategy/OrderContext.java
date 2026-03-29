package org.example.behavioural.strategy;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class OrderContext {
    private final double amount;
    private final String userType;// to enable specific types of coupons to specific types
    private final List<String> coupon;

}
