package btap3;

public class Car extends Vehicle {
    public Car(String brand, String color) {
        super(brand, color);
    }
    @Override
    public void start() {
        System.out.println("Car starting...");
    }
    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
    }
    @Override
    public void stop() {
        System.out.println("Car stopping...");
    }
}
