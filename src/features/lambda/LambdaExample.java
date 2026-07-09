package features.lambda;

@FunctionalInterface
interface Car {
    void speed(int x);

    default void brake() {
        System.out.println("Apply Brakes!");
    }
}

public class LambdaExample {
    public static void main(String[] args) {

        Car c = x -> {
            if (x > 100) {
                System.out.println("Overspeed!");
            } else {
                System.out.println("Normalspeed!");
            }
        };

        c.speed(70);
        c.brake();
    }
}