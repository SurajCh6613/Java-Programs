package Loops;
import java.util.*;

// Using for loop

// public class table {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter limit for table:");
//       int n = sc.nextInt();
//       for (int i = 1; i < n+1; i++) {
//         System.out.print(i+" ");
//       }  
//     }
    
// }

// Using while loop
public class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter limit for table:");
      int n = sc.nextInt();
      int i=1;
      while (i<n+1) {
        System.out.print(i+" ");
        i++;
      }
    }
}