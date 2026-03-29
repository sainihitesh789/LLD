package org.example.behavioural.observer;

public class EmailNotifier implements OrderListener{
    @Override
    public void onOrderUpdate(OrderEvent orderEvent) {
        System.out.println("Email sent to order :" + orderEvent.getOrderId());
    }
}
