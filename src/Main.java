import org.example.creational.singleton.PaymentGateway;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                PaymentGateway gateway = PaymentGateway.getPaymentGatewayInstance();
                System.out.println(Thread.currentThread().getName() + " -> " + gateway.hashCode());
            });
        }
    }
}