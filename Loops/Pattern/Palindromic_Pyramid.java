package Loops.Pattern;

public class Palindromic_Pyramid {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i < n; i++) {
            // Spaces
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = i; j >0;j--) {
                System.out.print(j);
            }
            for (int j = 2; j < i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
