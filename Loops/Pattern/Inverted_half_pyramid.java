package Loops.Pattern;

public class Inverted_half_pyramid {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
