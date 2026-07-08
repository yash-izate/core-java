package oops.classes;

// An anonymous class is an unnamed subclass that you create and instantiate at the same time.

class Animal {

    public void sound() {
        System.out.println("Animal makes sound");
    }
}

public class AnonymousClassDemo {

    public static void main(String[] args) {

        Animal obj = new Animal() {

            @Override
            public void sound() {
                System.out.println("Dog barks");
            }

            public void eat() {
                System.out.println("Dog eats bones.");
            }
        };

        obj.sound();
/*        obj.eat(); gives error because the reference type is Animal & The compiler only knows about methods that
           exist in class A.

   */
    }
}