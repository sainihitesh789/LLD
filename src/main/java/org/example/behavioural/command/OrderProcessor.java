package org.example.behavioural.command;

public class OrderProcessor {
    public void placeOrder(String orderId){
        System.out.println("Order placed : " + orderId);
    }
    public void cancelOrder(String orderId){
        System.out.println("Order Cancelled : "+ orderId);
    }
}
