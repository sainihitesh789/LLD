package org.example.behavioural.observer;

public class SMSNotifier implements OrderListener{
    @Override
    public void onOrderUpdate(OrderEvent orderEvent) {
        System.out.println("SMS sent successfully for the order :" + orderEvent.getOrderId());
    }
}
