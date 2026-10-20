//Sorting using Built-in method

import java.util.Scanner;
import java.util.Arrays;
public class Main25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i, j;
        int[] arr;

        System.out.print("\nEnter the size of your Array : ");
        n = scan.nextInt();
        
        if(n<0){
            System.out.println("Error! Size of the Array can't be negative...");
        }else if(n==0){
            System.out.println("Your Array is EMPTY!");
        }else{
            arr = new int[n];

            for( i=0;i<n;i++ ){
                System.out.print("Enter DATA " + (i+1) + " = ");
                arr[i] = scan.nextInt();
            }

            Arrays.sort(arr);
            System.out.println();

            System.out.println("Array After Sorting => ");
            for( j=0;j<n;j++ ){
                System.out.print("DATA " + (j+1) + " = ");
                System.out.println(arr[j]);
            }
        }

        scan.close();       
    }   
}