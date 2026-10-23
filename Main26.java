//Linear Searching

import java.util.Scanner;
public class Main26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i , j, key ,count=0;
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

            System.out.print("\nEnter your KEY : ");
            key = scan.nextInt();
            
            for( j=0;j<n;j++ ){
                if(key == arr[j]){
                    System.out.print("\n" + key + " FOUND AT POSITION = " + (j+1));
                    count = 1;
                }
            }
            if(count == 0){
                System.out.println("\n" + key + " NOT FOUND!");
            }
        }

        scan.close();       
    }   
}