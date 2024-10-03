import java.util.Scanner;

public class ExceptionHandling {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      try {
         System.out.print("Enter a number: ");
         int num = input.nextInt();

         // This will throw an ArithmeticException if num is zero
         int result = 100 / num;
         System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
         System.out.println("Error: Division by zero is not allowed.");
      } catch (java.util.InputMismatchException e) {
         System.out.println("Error: Please enter a valid integer.");
      } catch (Exception e) {
         System.out.println("An unexpected error occurred: " + e.getMessage());
      } finally {
         System.out.println("This block executes regardless of exceptions.");
         input.close();
      }
   }
}
