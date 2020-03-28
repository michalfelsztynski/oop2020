package wsb.devices;


public abstract class Device {
        final public String producer;
        final public String model;
        final public Double price;

    public Device(String producer, String model, Double price) {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

   public abstract void turnOn();

    public String getModel(){
        return this.model;
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
