package org.example.structural.facade;

import org.example.structural.composite.ProductBundle;
import org.example.structural.decorator.Product;

public class OrderFacade {
    // Front Face for the Complex Service
    private final Inventory inventory;
    private final Shipping shipping;
    private final Payment payment;

    public OrderFacade(){
        inventory = new Inventory();
        shipping = new Shipping();
        payment = new Payment();
    }

    public void placeOrder(Product product) {
        try{
            System.out.println("Now Processing :"+ product.description());
            payment.processPayment(product.price());
            Thread.sleep(2000);
            inventory.updateInventory(product.description());
            Thread.sleep(2000);
            shipping.arrangeForShipping(product.description());
            System.out.println("Order is Successfully place :)");
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void cancelOrder(Product product){
        try{
            System.out.println(" Now processing : "+ product.description());
            inventory.updateInventory(product.description());
            Thread.sleep(2000);
            shipping.arrangeForShipping(product.description());
            Thread.sleep(2000);
            payment.processPayment(product.price());
            System.out.println("Order is Successfully Cancelled !!");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
