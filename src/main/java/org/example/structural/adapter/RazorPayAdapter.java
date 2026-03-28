package org.example.structural.adapter;

public class RazorPayAdapter implements PaymentProcessor{
    private final RazorPay razorPay;
    public RazorPayAdapter(){ razorPay = RazorPay.getRazorPayInstance();
    }
    @Override
    public void pay(double amount) {
        razorPay.payViaRazorPay(amount);
    }
}
