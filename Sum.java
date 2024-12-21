import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the sum of the numbers
        double sum = num1 + num2 + num3;
        double average = sum/3;

        // Display the sum
        System.out.println("The sum of the three numbers is: " + sum);
        System.out.println("The average of the three numbers is: " + average);
        System.out.println("Exiting the program");

        // Close the scanner object
        scanner.close();
    }
}

