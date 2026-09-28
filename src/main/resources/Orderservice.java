package in.codepran;

import org.springframework.stereotype.Component;

@Component
public class Orderservice {

//    private Paymentservice paymentservice;
//    public Orderservice(Paymentservice pays){
//        this.paymentservice= pays;
    }
    public  void placeorder(){
//        paymentservice.pay();
        System.out.println("orderplaced");
    }
}
