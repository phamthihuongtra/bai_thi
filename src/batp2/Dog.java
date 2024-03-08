package batp2;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void move() {
        System.out.println("chay");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");

    }
}


