package wsb.devices;


public class Car extends Device {
    public final Integer yearOfProduction;
    public final Double sizeOfAnEngine;
    public String plates;


    public Car(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine, String plates, Double price) {
        super(producer, model, price);
        this.yearOfProduction = yearOfProduction;
        this.sizeOfAnEngine = sizeOfAnEngine;
        this.plates = plates;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", sizeOfAnEngine=" + sizeOfAnEngine +
                ", plates='" + plates + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }

    @Override
    public void turnOn() {
        System.out.println("car is ready to go");
    }

}
