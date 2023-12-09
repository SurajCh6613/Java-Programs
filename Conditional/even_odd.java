package Conditional;

import java.util.*;

public class even_odd {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if (n%2==0) {
            System.out.println("even number.");
        }
        else{
            System.out.println(" odd number.");
        }
    }
}
