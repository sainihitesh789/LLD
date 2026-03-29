package org.example.behavioural.observer;

public class TelegramNotifier implements OrderListener{
    @Override
    public void onOrderUpdate(OrderEvent orderEvent) {
        System.out.println("Telelgram notification sent for the order : "+orderEvent.getOrderId());
    }
}
