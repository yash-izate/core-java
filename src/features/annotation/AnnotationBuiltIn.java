package features.annotation;

/* What is an Annotation?
An annotation is a piece of metadata (information about the code).
It tells the compiler, JVM, or framework something about your code.
It does not directly change the program's logic.
Think of it as a label or instruction attached to your code.
Annotations start with "@".
Built-in Annotations
--------------------
1. @Override
2. @Deprecated
3. @SuppressWarnings
*/

import java.util.ArrayList;

class Vehicle {

    @Deprecated
    void play() {
        System.out.println("This method is deprecated.");
    }

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Started");
    }
}

class Demo {

    @SuppressWarnings("rawtypes")
    void display() {

        // Raw type generates a warning
        ArrayList list = new ArrayList();

        list.add("Java");
        list.add(100);

        System.out.println(list);
    }
}

public class AnnotationBuiltIn {

    public static void main(String[] args) {

        Vehicle obj = new Car();

        // @Override demonstration
        obj.start();

        // @Deprecated demonstration
        obj.play();

        // @SuppressWarnings demonstration
        Demo d = new Demo();
        d.display();
    }
}