package org.example.structural.decorator;

public class GiftWrap extends ProductDecorator{
    public GiftWrap(Product product){super(product);}
    @Override
    public String description() {
    StringBuilder sb = new StringBuilder();
    return sb.append(product.description()).append(" also adding a gift wrap to it.").toString();
    }
    @Override
    public double price() {
        return product.price()+10.00;
    }
}
