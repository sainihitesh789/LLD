package org.example.structural.adapter;

public class StripeAdapter implements PaymentProcessor{
    private final Stripe stripe;
    public  StripeAdapter(){stripe = Stripe.getStripeInstance();}
    @Override
    public void pay(double amount) {
        stripe.stripeKaro(amount);
    }
}
