package features.lambda;

/* A Functional Interface is an interface that contains exactly one abstract method.
It is mainly used with:
Lambda Expressions
Method References
Functional Programming (Java 8+)
*/


// Using Anonymous class

@FunctionalInterface
interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("This is Class B.");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        A obj1 = new B();

//        Anonymous Inner Class
        A obj2 = new A() {
            @Override
            public void show() {
                System.out.println("Anonymous Inner Class.");
            }
        };

        obj1.show();
        obj2.show();
    }
}