package Bit_Manipulation;

import java.util.Scanner;

// Set means change bit 0 to 1 or 1 to 0 at that position

public class set {
    public static void main(String[] args) {
         // Create a scanner class object as sc
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number");
 
         // Take number from user
         int number=sc.nextInt();
         System.out.println("Enter postion to set(Change) bit of number");
         int position=sc.nextInt();
         // Create a bitMask by left shifting (1) by given position by user 
         int bitMask= 1<<position;

         // To set value at given position
         int newNumber= bitMask | number;
         System.out.println("New number after set operation is : "+newNumber);
    }

}
