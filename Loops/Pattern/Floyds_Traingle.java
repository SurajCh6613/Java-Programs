package Loops.Pattern;

public class Floyds_Traingle {
    public static void main(String[] args) {
        int row=5;
        int column=5;
        int number=1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
