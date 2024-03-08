package btap1;

import java.awt.*;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Orange",2.0,5.0,3.0);
        System.out.println("Rectangle area: " + rectangle.area());

        Circle circle = new Circle("Red",1.5,4.0);
        System.out.println("Circle perimeter: " + circle.perimeter());

        Triangle triangle = new Triangle("Blue",1,3,4,5);
        System.out.println("Triangle area: " + triangle.area());
    }
}
