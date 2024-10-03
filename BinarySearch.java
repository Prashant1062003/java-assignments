import java.util.Scanner;

public class BinarySearch {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Input the array size
      System.out.print("Enter the number of elements: ");
      int n = input.nextInt();
      int[] arr = new int[n];

      // Input the sorted array
      System.out.println("Enter " + n + " sorted integers:");
      for (int i = 0; i < n; i++) {
         arr[i] = input.nextInt();
      }

      // Input the target element to search
      System.out.print("Enter the element to search: ");
      int target = input.nextInt();

      // Binary search
      int left = 0, right = n - 1, mid;
      boolean found = false;
      while (left <= right) {
         mid = (left + right) / 2;
         if (arr[mid] == target) {
            System.out.println("Element found at index: " + mid);
            found = true;
            break;
         } else if (arr[mid] < target) {
            left = mid + 1;
         } else {
            right = mid - 1;
         }
      }

      if (!found) {
         System.out.println("Element not found in the array.");
      }

      input.close();
   }
}
