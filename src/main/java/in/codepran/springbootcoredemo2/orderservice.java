package in.codepran.springbootcoredemo2;

import org.springframework.stereotype.Component;

@Component
public class orderservice {

    private paymentservice paymentservice;

    public orderservice(paymentservice paymentservice){
        this.paymentservice=paymentservice;
    }

    public void placorder(){
        paymentservice.pay();
        System.out.println("goood morning");
    }



}
