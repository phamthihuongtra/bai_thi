package batp2;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void makeSound() {
        System.out.println("nhay");

    }

}
