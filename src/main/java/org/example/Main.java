package org.example;

import org.example.creational.builder.Order;
import org.example.creational.factory.Payment;
import org.example.creational.factory.PaymentFactory;
import org.example.creational.factory.PaymentType;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
/*        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                PaymentGateway gateway = PaymentGateway.getPaymentGatewayInstance();
                System.out.println(Thread.currentThread().getName() + " -> " + gateway.hashCode());
            });
        }
        executorService.shutdown();*/
//        Class.forName("org.example.creational.factory.CreditCardPayment");
//        Class.forName("org.example.creational.factory.UPIPayment");
//        Class.forName("org.example.creational.factory.WalletPayment");
//        Payment p1 = PaymentFactory.create(PaymentType.CREDIT_CARD);
//        p1.pay(100);
//        Order order = new Order.OrderBuilder("01234")
//                .size("M").couponCode("Hitesh100")
//                .isBankOfferApplicable(true)
//                .build();
//        order.showOrderDetails();
        Order order = Order.builder()
                .size("M")
                .orderId("O123")
                .emi(true)
                .couponCode("BBD2K16")
                .finalPrice(1000)
                .orderStatus("In Transit")
                .build();
        order.showOrderDetails();
        }

    }