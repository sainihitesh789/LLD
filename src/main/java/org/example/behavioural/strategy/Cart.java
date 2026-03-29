package org.example.behavioural.strategy;

public class Cart {
    private final PricingRegistry registry;
    public Cart(PricingRegistry pricingregistry){
        this.registry = pricingregistry;
    }
    public double calculate(String strategyKey,OrderContext orderContext){
        return registry.getPricingStrategy(strategyKey).apply(orderContext);
    }

}
