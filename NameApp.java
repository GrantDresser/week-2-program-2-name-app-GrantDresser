import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your average hours of sleep per night as a decimal: ");
        double sleep = input.nextDouble();

        // Output
        System.out.println("\n----- Personal Information -----");
        System.out.format("Name: %s %s%n", firstName, lastName);
        System.out.format("Age: %d years%n", age);
        System.out.format("Average Sleep: %.1f hours per night%n", sleep);

        input.close();
    }
}

