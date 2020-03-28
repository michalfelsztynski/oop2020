package wsb.devices;

public class Car extends Device {
    public final Integer yearOfProduction;
    public final Double sizeOfAnEngine;
    public String plates;

    public Car(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
        super(producer, model);
        this.yearOfProduction = yearOfProduction;
        this.sizeOfAnEngine = sizeOfAnEngine;

    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", sizeOfAnEngine=" + sizeOfAnEngine +
                ", plates='" + plates + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                "} " + super.toString();
    }

    @Override
    public void turnOn() {
        System.out.println("car is ready to go");
    }
}
