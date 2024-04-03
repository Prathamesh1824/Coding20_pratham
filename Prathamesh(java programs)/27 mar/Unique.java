import java.util.*;
public class Unique {
   public static void main (String[] args) {
      int arr[] = {1, 5, 9, 1, 4, 9, 6, 5, 9, 7};
      int n = arr.length;
      int i, j;
      System.out.print("The array is: ");
      for (i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
      System.out.print("The distinct elements of above array are: ");
      for (i = 0; i < n; i++) {
         for (j = 0; j < i; j++)
         if (arr[i] == arr[j])
            break;
         if (i == j)
         System.out.print( arr[i] + " ");
      }
   }
}