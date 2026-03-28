package org.example.creational.factory;

public class CreditCardPayment implements Payment {
    static {
        PaymentFactory.register(PaymentType.CREDIT_CARD, CreditCardPayment::new);
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid $ "+ amount + " via Credit Card");
    }
}
