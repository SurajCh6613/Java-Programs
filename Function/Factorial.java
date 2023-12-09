package Function;

import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("Invalid Number ");
            return;
        }
        if(n==0){
            System.out.println("Factorial of zero is 1");
            return;
        }
        for (int i = 1; i < n+1; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printFactorial(number);

    }
}
