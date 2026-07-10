package multithreading;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(7);
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        a.start();
        b.start();

    }
}