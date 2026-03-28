import org.example.creational.factory.Payment;
import org.example.creational.factory.PaymentFactory;
import org.example.creational.factory.PaymentType;
import org.example.creational.singleton.PaymentGateway;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
/*        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                PaymentGateway gateway = PaymentGateway.getPaymentGatewayInstance();
                System.out.println(Thread.currentThread().getName() + " -> " + gateway.hashCode());
            });
        }
        executorService.shutdown();*/
        Class.forName("org.example.creational.factory.CreditCardPayment");
        Class.forName("org.example.creational.factory.UPIPayment");
        Class.forName("org.example.creational.factory.WalletPayment");
        Payment p1 = PaymentFactory.create(PaymentType.CREDIT_CARD);
        p1.pay(100);
    }
}