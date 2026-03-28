package org.example.structural.adapter;

public class RazorPay {
    private static volatile RazorPay razorPayInstance;
    RazorPay(){System.out.println("Initializing one RazorPay Instance ...");}

    public static RazorPay getRazorPayInstance(){
        if(razorPayInstance == null){
            synchronized (RazorPay.class){
                if(razorPayInstance == null){
                    razorPayInstance = new RazorPay();
                }
            }
        }
        return razorPayInstance;
    }
    public void payViaRazorPay(double amount){
        System.out.println("Payment of : "+amount+" has been paid by RazorPay!");
    }


}
