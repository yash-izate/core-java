package features.enumeration;

enum Statuss {
    Running,
    Failed,
    Pending,
    Success;
}

public class EnumSwitchDemo {
    public static void main(String[] args) {

        Statuss st = Statuss.Failed;

        System.out.println("Current Statuss: " + st);
        System.out.println("Ordinal: " + st.ordinal());

        System.out.println("\nAll Statuss Values:");
        Statuss[] arr = Statuss.values();

        for (Statuss ele : arr) {
            System.out.println(ele + " : " + ele.ordinal());
        }

        System.out.println("\nUsing Switch:");

        switch (st) {

            case Running:
                System.out.println("Application is currently running.");
                break;

            case Failed:
                System.out.println("Application execution failed.");
                break;

            case Pending:
                System.out.println("Please wait. The task is still pending.");
                break;

            case Success:
                System.out.println("Task completed successfully.");
                break;

            default:
                System.out.println("Unknown status.");
        }
    }
}