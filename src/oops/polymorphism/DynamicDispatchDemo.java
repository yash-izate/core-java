package oops.polymorphism;

class Animal {
    public void sound() {
        System.out.println("Animal makes sound!");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog Barks!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat Meows!");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

    }
}