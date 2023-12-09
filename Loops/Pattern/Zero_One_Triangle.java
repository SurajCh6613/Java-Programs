package Loops.Pattern;

import javax.swing.text.html.FormView;

public class Zero_One_Triangle {
    public static void main(String[] args) {
       int n=4,m=5;
       for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum=i+j;
                if (sum%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
       } 
    }
   
    
}
