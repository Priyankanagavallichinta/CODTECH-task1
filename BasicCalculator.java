import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Prompt user to choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter operation number: ");
        int operation = scanner.nextInt();

        double result = 0;

        // Perform the selected operation
        switch (operation) {
            case 1:
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}