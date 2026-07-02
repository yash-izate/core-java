package oops.polymorphism;

class Employee {

    void work() {
        System.out.println("Employee Working");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Writing Java Code");
    }
}

class Tester extends Employee {

    @Override
    void work() {
        System.out.println("Testing Application");
    }
}

public class Company {

    public static void main(String[] args) {

        Employee emp;

        emp = new Developer();
        emp.work();

        emp = new Tester();
        emp.work();
    }
}