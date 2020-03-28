package wsb.devices;

import wsb.Human;
import wsb.Soldable;

public class Phone extends Device implements Soldable {
    final Double screenSize;

    public Phone(String producer, String model, Double screenSize,Double price) {
        super(producer,model,price);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("phone is turned on");
    }

    public void sell(Human buyer, Human seller, Double price){
        if (buyer.cash>=price) {
            buyer.cash -= price;
            seller.cash+= price;
            buyer.mobile=this;
            seller.mobile=null;
            System.out.println(seller.firstName + " phone sold to " + buyer.firstName);
        }else{
            System.out.println("no enough cash");
        }
    }
}
