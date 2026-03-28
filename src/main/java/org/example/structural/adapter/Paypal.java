package org.example.structural.adapter;

public class Paypal {
    private static volatile Paypal payPalInstance;
    Paypal(){System.out.println( "Initializing one Paypal instance ...");}
    public static Paypal getPayPalInstance(){
        if(payPalInstance == null) {
            synchronized ((Paypal.class)) {
                if (payPalInstance == null) {
                    payPalInstance = new Paypal();
                }
            }
        }
        return payPalInstance;
    }
    public  void payPalPayment(double amount){
        System.out.println("Payment of :"+amount+" has been paid by Paypal!");
    }
}
