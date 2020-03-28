package wsb;

import wsb.devices.Car;
import wsb.devices.Device;
import wsb.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog = new Animal("dog");
        dog.name = "Akita";

        Phone iphone = new Phone("Apple", "6s", 4.7);

        Human me = new Human();
        me.firstName = "Michal";
        me.lastName = "F";
        me.pet = dog;
        me.mobile = iphone;

        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        Car dirtyOne = new Car("fiat", "bravo", 2014, 1.6);
        dirtyOne.plates = "GDA2314";
        me.car = dirtyOne;
        System.out.println(me.car.producer + " " + me.car.model + " " + me.car.plates);

        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Object);

        me.feed();
        me.pet.feed();

        iphone.turnOn();
        dirtyOne.turnOn();

        iphone.sell();
        me.pet.sell();
//        me.sell();

        Human wife = new Human();
        wife.firstName="wife";
        wife.car=dirtyOne;

        System.out.println(me.firstName +"  " +me.car);
        System.out.println(wife.firstName+"  " +wife.car);

    }
}
