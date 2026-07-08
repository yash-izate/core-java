package features.lambda;

/* (Using Lambda Expression)
This is why functional interfaces exist.
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