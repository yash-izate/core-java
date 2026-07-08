package features.lambda;

// Functional Interface Without Lambda

@FunctionalInterface
interface Animal {

    void sound();
}

class Dog implements Janwar {

    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class FunctionalInterfaceDemo2 {

    public static void main(String[] args) {

        Janwar obj = new Dog();

        obj.sound();
    }
}