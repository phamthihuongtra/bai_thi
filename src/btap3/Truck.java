package btap3;

public class Truck extends Vehicle{
    public Truck(String brand, String color) {
        super(brand, color);
    }
    @Override
    public void start() {
        System.out.println("Truck starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerating...");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopping...");
    }
}
