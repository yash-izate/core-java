package features.enumeration;

enum EmployeeLevel {

    INTERN(15000),
    JUNIOR(30000),
    SENIOR(60000),
    MANAGER(100000);

    private int salary;

    EmployeeLevel(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class EnumClassDemo {

    public static void main(String[] args) {

        EmployeeLevel emp = EmployeeLevel.SENIOR;

        System.out.println("Employee Level : " + emp);
        System.out.println("Salary         : ₹" + emp.getSalary());

        switch (emp) {

            case INTERN:
                System.out.println("Learning new technologies.");
                break;

            case JUNIOR:
                System.out.println("Working under senior developers.");
                break;

            case SENIOR:
                System.out.println("Leading project modules.");
                break;

            case MANAGER:
                System.out.println("Managing the development team.");
                break;
        }
    }
}