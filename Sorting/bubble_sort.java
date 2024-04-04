package Sorting;

import java.util.Scanner;

public class bubble_sort {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  To manually enter array element
        System.out.println("Enter size of the array");  
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n +" elements :");
        for(int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        // int arr[]  = new int[]{7,8,4,5,2,1,3,6};  //Array Initialization

        // Sorting the array element
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Printing the sorted array
        printArray(arr);
    
    }
}
