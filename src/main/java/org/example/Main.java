package org.example;

import org.example.creational.builder.Order;
import org.example.creational.factory.Payment;
import org.example.creational.factory.PaymentFactory;
import org.example.creational.factory.PaymentType;
import org.example.structural.adapter.PaymentProcessor;
import org.example.structural.adapter.PaypalAdapter;
import org.example.structural.adapter.PaytmAdapter;
import org.example.structural.adapter.PhonePeAdapter;
import org.example.structural.composite.Item;
import org.example.structural.composite.ProductBundle;
import org.example.structural.decorator.*;
import org.example.structural.facade.OrderFacade;

public class Main {
    public static void main(String[] args) throws Exception {
/*        Used By Singleton
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                PaymentGateway gateway = PaymentGateway.getPaymentGatewayInstance();
                System.out.println(Thread.currentThread().getName() + " -> " + gateway.hashCode());
            });
        }
        executorService.shutdown();*/
//          Used By Factory
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

       /* Used by Builder
       Order order = Order.builder()
                .size("M")
                .orderId("O123")
                .emi(true)
                .couponCode("BBD2K16")
                .finalPrice(1000)
                .orderStatus("In Transit")
                .build();
        order.showOrderDetails();
        */
        //Adapter Design
        /*PaymentProcessor phonePeClient = new PhonePeAdapter();
        phonePeClient.pay(1000);
        PaymentProcessor payPalClient = new PaypalAdapter();
        payPalClient.pay(5000);
        PaymentProcessor paytmClient = new PaytmAdapter();
        paytmClient.pay(10000);*/
        // Decorator Desing Pattern
        /*Product tshirt = new BasicProduct("XL Sized White Polo Tshirt",900.00);
        System.out.println("Price of Product is : "+tshirt.price());
        System.out.println("Description of Product is : "+tshirt.description());
        System.out.println("==============================================");
        tshirt = new GiftWrap(tshirt);
        System.out.println("Price of Product is : "+tshirt.price());
        System.out.println("Description of Product is : "+tshirt.description());
        System.out.println("==============================================");
        tshirt = new ExtendedWarranty(tshirt);
        System.out.println("Price of Product is : "+tshirt.price());
        System.out.println("Description of Product is : "+tshirt.description());
        System.out.println("==============================================");
        tshirt = new PrimeDelivery(tshirt);
        System.out.println("Final Price of Product is : "+tshirt.price());
        System.out.println("Final Description of Product is : "+tshirt.description());
        System.out.println("==============================================");*/
        //Composite Design
        /*Product ps5 = new Item(50000.00,"PS5");
        Product controller = new Item(20000.00,"PS5 Controller");
        Product fifa = new Item(10000.00,"Fifa Game");
        ProductBundle summerBonanzaBundle = new ProductBundle("Summer Gaming Bundle");
        summerBonanzaBundle.addToProductList(ps5);
        summerBonanzaBundle.addToProductList(controller);
        summerBonanzaBundle.addToProductList(fifa);
        System.out.println(summerBonanzaBundle.description() + " now selling at :"+summerBonanzaBundle.price());

*/      // Facade
        Product iphone = new BasicProduct("Iphone 17 pro max",15000.00);
        OrderFacade facade = new OrderFacade();
        facade.placeOrder(iphone);
    }
    }