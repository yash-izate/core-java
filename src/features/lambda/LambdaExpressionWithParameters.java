package features.lambda;

/*
Why can lambda expressions only be used with functional interfaces?
Because Java must know exactly one method that the lambda is implementing. If an interface had multiple abstract
methods, Java would not know which one the lambda corresponds to.

Can a lambda expression replace any interface?
No. It can only replace an implementation of a functional interface.
*/

@FunctionalInterface
interface Calculator {

    int add(int a, int b);
}


public class LambdaExpressionWithParameters {

    public static void main(String[] args) {

        Calculator c = (a, b) -> a + b;

        System.out.println(c.add(10, 20));
    }
}