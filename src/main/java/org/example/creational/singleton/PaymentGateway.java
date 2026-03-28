package org.example.creational.singleton;

public class PaymentGateway {
    private static volatile PaymentGateway paymentGatewayInstance;

    private PaymentGateway(){
        System.out.println("Initializing Payment Gateway");
    }
    public static PaymentGateway getPaymentGatewayInstance(){
        if(paymentGatewayInstance == null){
            synchronized (PaymentGateway.class) {
                if(paymentGatewayInstance == null) {
                    paymentGatewayInstance = new PaymentGateway();
                }
            }
        }
        return paymentGatewayInstance;
    }
}
