package features.lambda;

@FunctionalInterface
interface Max {

    int maximum(int a, int b);
}

public class LambdaExpressionWithReturn {

    public static void main(String[] args) {

        Max m = (a, b) -> {

            if (a > b)
                return a;

            return b;
        };

        System.out.println(m.maximum(20, 50));
    }
}