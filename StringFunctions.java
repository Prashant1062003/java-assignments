import java.util.Scanner;

public class StringFunctions {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Input the string
      System.out.print("Enter a string: ");
      String str = input.nextLine();

      // toUpperCase()
      String upperStr = str.toUpperCase();
      System.out.println("Uppercase: " + upperStr);

      // toLowerCase()
      String lowerStr = str.toLowerCase();
      System.out.println("Lowercase: " + lowerStr);

      // trim()
      String trimmedStr = str.trim();
      System.out.println("Trimmed: " + trimmedStr);

      // startsWith() and endsWith()
      System.out.print("Enter a prefix to check: ");
      String prefix = input.nextLine();
      System.out.println("Starts with \"" + prefix + "\": " + str.startsWith(prefix));

      System.out.print("Enter a suffix to check: ");
      String suffix = input.nextLine();
      System.out.println("Ends with \"" + suffix + "\": " + str.endsWith(suffix));

      // charAt()
      System.out.print("Enter an index to get character: ");
      int index = input.nextInt();
      System.out.println("Character at index " + index + ": " + str.charAt(index));

      // length()
      System.out.println("Length of the string: " + str.length());

      // valueOf()
      int number = 123;
      String valueOfNumber = String.valueOf(number);
      System.out.println("String value of number 123: " + valueOfNumber);

      // replace()
      input.nextLine();  // To consume newline
      System.out.print("Enter the substring to replace: ");
      String target = input.nextLine();
      System.out.print("Enter the replacement string: ");
      String replacement = input.nextLine();
      String replacedStr = str.replace(target, replacement);
      System.out.println("Replaced string: " + replacedStr);

      input.close();
   }
}


