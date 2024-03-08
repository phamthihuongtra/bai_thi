package btap3;

import javax.lang.model.element.NestingKind;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, String color) {
        super(brand, color);
    }
    @Override
    public void start() {
        System.out.println("Motorcycle starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerating...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopping...");
    }

}
