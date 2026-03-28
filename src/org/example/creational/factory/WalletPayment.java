package org.example.creational.factory;

public class WalletPayment implements Payment{
        static {
            PaymentFactory.register(PaymentType.WALLET, WalletPayment::new);
        }
    @Override
    public void pay(double amount) {
        System.out.println("Paid $ "+ amount + "via Wallet");
    }
}
