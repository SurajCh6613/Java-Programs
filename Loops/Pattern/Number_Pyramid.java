package Loops.Pattern;

public class Number_Pyramid {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i < n; i++) {
            // Spaces
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j < i+1; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
