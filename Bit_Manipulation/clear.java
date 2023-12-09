package Bit_Manipulation;

import java.util.Scanner;

// Clear means change the bit from 1 to 0 at given position

public class clear {
    public static void main(String[] args) {
         // Create a scanner class object as sc
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number");
 
         // Take number from user
         int number=sc.nextInt();
         System.out.println("Enter postion to clear bit of number");
         int position=sc.nextInt();
         // Create a bitMask by left shifting (1) by given position by user 
         int bitMask= 1<<position;

         bitMask=~bitMask;

         int newNumber = bitMask & number;
         System.out.println("New number after clear operation is "+newNumber);
    }
}
