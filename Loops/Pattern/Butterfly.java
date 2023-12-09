package Loops.Pattern;

import java.security.Principal;

public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        //Upper half
        for (int i = 1; i < n+1; i++) {
            // Ist half
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            // Spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Seocnd Half
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half

        for (int i = n; i > 0; i--) {
            // Ist half
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }

            // Spaces
            int spaces = 2*(n-i);
            for (int j = spaces; j >0; j--) {
                System.out.print(" ");
            }
            // Seocnd Half
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
