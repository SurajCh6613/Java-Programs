package Loops.Pattern;

import java.util.Scanner;

public class Hallow_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int row = sc.nextInt();
        System.out.print("Enter number of column: ");
        int column = sc.nextInt();
        // Outer loop
        for (int i = 1; i <= row; i++) {
            // Inner loop
            for (int j = 1; j <= column; j++) {
                if (i==1 || i==row || j==1 || j==column) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
