package org.example.structural.adapter;

public class PaytmAdapter implements PaymentProcessor{
    private final  Paytm paytm;
    public PaytmAdapter(){paytm = Paytm.getPaytmInstance();}
    @Override
    public void pay(double amount) {
        paytm.paytmKaro(amount);
    }
}
