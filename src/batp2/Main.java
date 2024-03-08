package batp2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("thuy",3);
        dog.makeSound();
        dog.move();

        Cat cat = new Cat("nghia", 6);
        cat.makeSound();
        cat.move();

        Bird bird = new Bird("sao", 2);
        bird.makeSound();
        bird.move();
    }

}