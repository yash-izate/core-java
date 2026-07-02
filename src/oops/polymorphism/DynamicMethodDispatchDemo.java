package oops.polymorphism;

// Parent Class
class Animals {

    // Parent method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class Dogs extends Animals {

    // Overriding the parent's method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Child's own method
    void eat() {
        System.out.println("Dog eats bones");
    }
}

public class DynamicMethodDispatchDemo {

    public static void main(String[] args) {

        // Parent reference
        Animals obj;

        // Parent reference refers to Child object
        obj = new Dogs();

        // Dynamic Method Dispatch
        // Java checks the OBJECT type (Dog), not the reference type (Animal)
        // Therefore Dog's sound() is executed.
        obj.sound();

        // ❌ Not Allowed
        // Parent reference cannot access child-specific methods.
        // obj.eat();

        // To access child methods, create a child reference.
        Dogs d = new Dogs();

        d.sound();   // Dog's overridden method
        d.eat();     // Child's own method
    }
}