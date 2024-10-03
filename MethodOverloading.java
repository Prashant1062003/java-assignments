class Calculator {
    // Overloaded method for adding two integers
    public int add(int a, int b) {
       return a + b;
    }
 
    // Overloaded method for adding three integers
    public int add(int a, int b, int c) {
       return a + b + c;
    }
 
    // Overloaded method for adding two doubles
    public double add(double a, double b) {
       return a + b;
    }
 }
 
 public class MethodOverloading {
    public static void main(String[] args) {
       Calculator calc = new Calculator();
 
       // Calling overloaded methods
       int sum1 = calc.add(10, 20);
       int sum2 = calc.add(10, 20, 30);
       double sum3 = calc.add(10.5, 20.5);
 
       System.out.println("Sum of two integers: " + sum1);
       System.out.println("Sum of three integers: " + sum2);
       System.out.println("Sum of two doubles: " + sum3);
    }
 }
 