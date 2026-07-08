package features.lambda;

/*
A Lambda Expression is a shorter way to implement a functional interface.
This is why functional interfaces exist.

Where Are Lambdas Used?
Collections (sort())
Streams
Threads
Event handling
Functional programming
*/

@FunctionalInterface
interface Janwar {

    void sound();
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {

        Janwar obj = () -> System.out.println("Dog Barks");
        obj.sound();
    }
}