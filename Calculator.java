import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Input numbers
      System.out.print("Enter the first number: ");
      double num1 = input.nextDouble();
      System.out.print("Enter the second number: ");
      double num2 = input.nextDouble();

      // Input operator
      System.out.print("Choose an operator (+, -, *, /, %): ");
      char operator = input.next().charAt(0);

      // Perform the selected operation
      double result;
      switch (operator) {
         case '+':
            result = num1 + num2;
            System.out.println("Result: " + result);
            break;
         case '-':
            result = num1 - num2;
            System.out.println("Result: " + result);
            break;
         case '*':
            result = num1 * num2;
            System.out.println("Result: " + result);
            break;
         case '/':
            if (num2 != 0) {
               result = num1 / num2;
               System.out.println("Result: " + result);
            } else {
               System.out.println("Error! Division by zero.");
            }
            break;
         case '%':
            if (num2 != 0) {
               result = num1 % num2;
               System.out.println("Result: " + result);
            } else {
               System.out.println("Error! Division by zero.");
            }
            break;
         default:
            System.out.println("Invalid operator!");
            break;
      }

      input.close();
   }
}
