package Bit_Manipulation;

import java.util.Scanner;

// get means accessing the bit of a number at that position 

public class get {
    public static void main(String[] args) {
        // Create a scanner class object as sc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        // Take number from user
        int number=sc.nextInt();
        System.out.println("Enter postion to get bit of number");
        int position=sc.nextInt();
        // Create a bitMask by left shifting (1) by given position by user 
        int bitMask= 1<<position;

        // Compare bitMask and original number bit by bit
        if((bitMask & number)==0){
            System.out.println("bit at position "+position+" is zero ");
        }
        else{
            System.out.println("bit at position "+position+" is one "); 
        }
    }
}
