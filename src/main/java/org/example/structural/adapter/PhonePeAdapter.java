package org.example.structural.adapter;

public class PhonePeAdapter implements PaymentProcessor{
    private final PhonePe phonePe;
    public PhonePeAdapter(){phonePe = PhonePe.getPhonepeInstance();}
    @Override
    public void pay(double amount) {
        phonePe.phonePayPmt(amount);
    }
}
