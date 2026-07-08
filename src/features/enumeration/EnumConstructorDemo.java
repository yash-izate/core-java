package features.enumeration;

enum Laptop {

    HP(65000),
    DELL(70000),
    LENOVO(60000);

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}


public class EnumConstructorDemo {

    public static void main(String[] args) {

        Laptop lap = Laptop.DELL;

        System.out.println(lap);
        System.out.println(lap.getPrice());
    }
}