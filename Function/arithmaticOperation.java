package Function;

import java.util.Scanner;


public class arithmaticOperation {
    public static int calculateSum(int a, int b){
        return a+b;
    }
    public static int calculateMultiplication(int a, int b){
        return a*b;
    }
    public static float calculateDivision(int a, int b){
        return (a/b);
    } public static int calculateSubtraction(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+calculateSum(a, b));
        System.out.println("Subtraction of "+a+" and "+b+" is "+calculateSubtraction(a, b));
        System.out.println("Multiplication of "+a+" and "+b+" is "+calculateMultiplication(a, b));
        System.out.println("Division of "+a+" and "+b+" is "+calculateDivision(a, b));
    }
}
