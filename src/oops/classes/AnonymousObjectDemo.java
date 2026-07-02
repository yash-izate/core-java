package oops.classes;


// Definition - An anonymous object is an object that is created without storing it in a reference variable.

//Why needed ?
// It reduces unnecessary reference variables when an object is needed only once. It makes the code shorter and
// slightly reduces memory usage because no reference variable is maintained. However, if you need to reuse the
// object, create a normal object instead.

class Student {

    Student() {
        System.out.println("Constructor Called");
    }

    void display() {
        System.out.println("Hello, I am a student.");
    }
}

class Calculator {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

public class AnonymousObjectDemo {

    public static void main(String[] args) {

        new Student().display();
        new Calculator().add(10, 20);
    }
}