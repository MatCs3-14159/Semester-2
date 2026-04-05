package Workshop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class que13 {

    // Function to take input
    public static double[] getInput(Scanner scanner) {
        double[] numbers = new double[2];

        while (true) {
            try {
                System.out.print("Enter Quantity: ");
                numbers[0] = scanner.nextInt();

                System.out.print("Enter Price: ");
                numbers[1] = scanner.nextDouble();

                if (numbers[0] <= 0) {
                    System.out.println("Quantity must be greater than 0.");
                    continue;
                }

                if (numbers[1] < 0) {
                    System.out.println("Price cannot be negative.");
                    continue;
                }

                return numbers;   // return directly if valid

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                scanner.nextLine(); // clear wrong input
            }
        }
    }

    // Function to calculate total
    public static double calculate(double quantity, double price) {
        return quantity * price;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- FINAL PRICE CALCULATOR -----");

        double[] values = getInput(scanner);

        double total = calculate(values[0], values[1]);

        System.out.printf("Total Price: %.2f", total);

        scanner.close();
    }
}
