package org.example.creational.builder;

import lombok.Builder;
@Builder
public class Order {
    private String orderId;
    private String userId;
    private long createdAt;
    private String orderStatus;
    private long baseAmount;
    private long finalPrice;
    private boolean emi;
    private String deliveryType;
    private boolean isBankOfferApplicable;
    private String couponCode;
    private String size;

//    public Order(OrderBuilder orderBuilder) {
//        this.size = orderBuilder.size;
//        this.emi = orderBuilder.emi;
//        this.deliveryType = orderBuilder.deliveryType;
//        this.isBankOfferApplicable = orderBuilder.isBankOfferApplicable;
//        this.couponCode = orderBuilder.couponCode;
//    }

//    public static class OrderBuilder{
//        private String orderId;
//        private boolean emi;
//        private String deliveryType;
//        private boolean isBankOfferApplicable;
//        private String couponCode;
//        private String size;
//
//        public OrderBuilder(String orderId){
//            this.orderId = orderId;
//
//        }
//        public OrderBuilder emi(boolean emi){
//            this.emi = emi;
//            return this;
//        }
//        public OrderBuilder deliveryType(String deliveryType){
//            this.deliveryType = deliveryType;
//            return this;
//        }
//        public OrderBuilder isBankOfferApplicable(boolean isBankOfferApplicable){
//            this.isBankOfferApplicable = isBankOfferApplicable;
//            return this;
//        }
//        public OrderBuilder couponCode(String couponCode){
//            this.couponCode = couponCode;
//            return this;
//        }
//        public OrderBuilder size(String size){
//            this.size = size;
//            return this;
//        }
//    public Order build(){
//      return new Order(this);
//    }
//
//
//    }
    public void showOrderDetails(){
        System.out.println("Order has "+ finalPrice + orderId + orderStatus + isBankOfferApplicable);
    }


}
