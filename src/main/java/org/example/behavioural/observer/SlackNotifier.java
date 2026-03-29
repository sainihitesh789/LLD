package org.example.behavioural.observer;

public class SlackNotifier implements OrderListener{
    @Override
    public void onOrderUpdate(OrderEvent orderEvent) {
        System.out.println("Slack Update sent for the order : "+ orderEvent.getOrderId());
    }
}
