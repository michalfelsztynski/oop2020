package wsb;

import wsb.animals.Animal;
import wsb.devices.Car;
import wsb.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone mobile;
    public Car car;
    public Double cash;

    protected String phoneNumber;
    private Double salary;

    public Human() {
        super("homo sapiens");
    }

    public Double getSalary() {
        return salary;
    }

    public void sell() throws Exception {
        throw new Exception("don't do this freak");
    }

    public void eat() throws Exception {
        throw new Exception("don't do this freak");
    }


}
