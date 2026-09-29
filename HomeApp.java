import java.util.Scanner;

public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Intelligent Home System!");

        while (running) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Turn ON all services");
            System.out.println("2. Turn OFF all services");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    homeInterface.turnOnAll();
                    break;
                case "2":
                    homeInterface.turnOffAll();
                    break;
                case "3":
                    System.out.println("Exiting System. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }
        }
    }
}