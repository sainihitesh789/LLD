package org.example.structural.adapter;

public class Paytm {
    private static  volatile Paytm paytmInstance;
    Paytm(){System.out.println( "Initializing one Paytm instance ...");}
    public static Paytm getPaytmInstance(){
        if(paytmInstance == null){
            synchronized (Paytm.class){
                if(paytmInstance == null){
                    paytmInstance = new Paytm();
                }
            }
        }
        return paytmInstance;
    }
    public void paytmKaro(double amount){
        System.out.println("Payment of : "+amount+" has been paid by Paytm!");
    }
}
