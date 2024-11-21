import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueClass queueClass = new QueueClass();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Welcome to Pag-IBIG Centralized Queuing System ===");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Get Queue Number");
            System.out.println("2. Serve Next (Help Desk)");
            System.out.println("3. Reset Queue");
            System.out.println("4. Display Queue Status");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queueClass.addToQueue();
                    break;
                case 2:
                    System.out.print("Enter Help Desk Name: ");
                    String helpDeskName = sc.next();
                    queueClass.serveNext(helpDeskName);
                    break;
                case 3:
                    System.out.print("Enter new starting queue number: ");
                    int newNumber = sc.nextInt();
                    queueClass.resetQueue(newNumber);
                    break;
                case 4:
                    queueClass.displayQueue();
                    break;
                case 5:
                    System.out.println("Exiting the system. Have a great day!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
