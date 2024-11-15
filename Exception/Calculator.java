package Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        // Read two integers from the user
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();

        try {
            // Attempt division
            int result = f1 / f2;
            System.out.printf("Result is: %d%n", result);
        } catch (ArithmeticException exception) {
            // Check if the exception is due to division by zero
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("Dividing by zero is not allowed.");
            } else {
                // Re-throw the exception if it's another arithmetic error
                throw exception;
            }
        } finally {
            // Close the scanner resource
            sc.close();
        }
    }
}
