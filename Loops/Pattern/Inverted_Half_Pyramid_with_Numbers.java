package Loops.Pattern;

public class Inverted_Half_Pyramid_with_Numbers {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
                for (int j = 1; j < 6; j++) {
                    if (i+j<=6) {
                        System.out.print(j+" ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
    }
}
