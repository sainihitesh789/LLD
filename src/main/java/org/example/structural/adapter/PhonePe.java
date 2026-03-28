package org.example.structural.adapter;

public class PhonePe {
    private static volatile PhonePe phonepeInstance;
    PhonePe(){
        System.out.println("Initializing one PhonePe Instance ...");
    }
    public static PhonePe getPhonepeInstance(){
        if(phonepeInstance == null){
            synchronized (PhonePe.class){
                if(phonepeInstance==null){
                    phonepeInstance = new PhonePe();
                }
            }
        }
        return phonepeInstance;
    }

    public void phonePayPmt(double amount){
        System.out.println("Payment of : "+amount+" has been paid by Phonepe!");
    }


}
