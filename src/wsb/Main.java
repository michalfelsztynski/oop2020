package wsb;

import wsb.animals.Animal;
import wsb.animals.FarmAnimal;
import wsb.animals.Pet;
import wsb.devices.Car;
import wsb.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog = new Pet("dog");
        dog.name = "Akita";

        Animal cow = new FarmAnimal("cow");
        dog.name = "2325";

        Phone iphone = new Phone("Apple", "6s", 4.7, 3000D);

        Human me = new Human();
        me.firstName = "Michal";
        me.lastName = "F";
        me.pet = dog;
        me.mobile = iphone;
        me.cash = 335253235D;

        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        Car dirtyOne = new Car("fiat", "bravo", 2014, 1.6, "gd", 30.000D);
        me.car = dirtyOne;
        System.out.println(me.car.producer + " " + me.car.model + " " + me.car.plates);

        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Object);

        me.feed();
        me.pet.feed();

        iphone.turnOn();
        dirtyOne.turnOn();

//        me.pet.sell();
////        me.sell();
//
        Human wife = new Human();
        wife.firstName = "wife";
        wife.car = dirtyOne;
        wife.cash = 30000000D;
//
//        System.out.println(me.firstName +"  " +me.car);
//        System.out.println(wife.firstName+"  " +wife.car);
//
//
//        Device d = new Phone("sony", "xou", 5.5,3000F);
//        System.out.println(d instanceof Device);
        System.out.println(me.cash);
        System.out.println(me.mobile);
        iphone.sell(wife, me, iphone.price);
        System.out.println(me.cash);
        System.out.println(me.mobile);
        System.out.println(cow);
        ((FarmAnimal) cow).eat();
        ((Pet) dog).eat();
    }
}
