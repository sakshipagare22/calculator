import java.util.InputMismatchException;
import java.util.Scanner;

public class Rutuja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            try {
                double num1, num2, result;
                int choice;

                System.out.println("Enter Two Numbers...");
                num1 = s.nextDouble();
                num2 = s.nextDouble();

                System.out.println("Enter Your Choice...");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");

                choice = s.nextInt();

                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    continue;
                }

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Addition: " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("Subtraction: " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Multiplication: " + result);
                        break;

                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Division: " + result);
                        } else {
                            System.out.println("Error: Cannot divide by zero");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice..!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                s.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String continueCalculation = s.next().toLowerCase();
            if (!continueCalculation.equals("yes")) {
                break;
            }
        }

        s.close();
    }
}