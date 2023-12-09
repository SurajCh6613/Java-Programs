package Bit_Manipulation;

import java.util.Scanner;

// Update means to update bit either 0 or 1 at given position

public class update {
    public static void main(String[] args) {
         // Create a scanner class object as sc
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number");
 
         // Take number from user
         int number=sc.nextInt();
         //  Enter bit to change i.e. 0 or 1
         System.out.println(" Enter operation to perform i.e. 0 or 1");
         int operation=sc.nextInt();
         System.out.println("Enter postion to update");
         int position=sc.nextInt();
         // Create a bitMask by left shifting (1) by given position by user 
         int bitMask= 1<<position;

         if(operation==1){
            int newNumber= bitMask|number;
            System.out.println("New number after operation: "+newNumber);
         }
         else if(operation==0){
            bitMask=~bitMask;
            int newNumber=bitMask&number;
            System.out.println("New number after operation: "+newNumber);
         }
         else{
            System.out.println("Wrong bit entered");
         }
    }
}
