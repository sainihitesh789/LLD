package org.example.behavioural.command;

public class PlaceOrderCommand implements Command{
    private final OrderProcessor orderProcessor;
    private final String orderId;

    public PlaceOrderCommand(OrderProcessor orderProcessor, String orderId) {
        this.orderProcessor = orderProcessor;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
    orderProcessor.placeOrder(orderId);
    }

    @Override
    public void undo() {
    orderProcessor.cancelOrder(orderId);
    }
}
