package btap3;

import batp2.Cat;
import batp2.Dog;

public class main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("honda","xanh");
        motorcycle.start();
        motorcycle.accelerate();

        Truck truck = new Truck("torota", "do");
        truck.start();
        truck.accelerate();
        truck.stop();
    }
}
