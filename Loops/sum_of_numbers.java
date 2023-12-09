package Loops;

import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for sum");
        int number = sc.nextInt();
        int sum =0;
        for (int i = 0; i < number+1; i++) {
            sum+=i;
        }
        System.out.println("Sum of numbers till "+number+" is "+sum);

    }
}
