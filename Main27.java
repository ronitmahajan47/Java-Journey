//Binary Searching
//NOTE = Binary Search program works well when the array have unique elements

import java.util.Arrays;
import java.util.Scanner;
public class Main27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i , j, key ,result;
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

            System.out.println("\nArray After Sorting => ");
            for( j=0;j<n;j++ ){
                System.out.print("DATA " + (j+1) + " = ");
                System.out.println(arr[j]);
            }

            System.out.print("\nEnter your KEY : ");
            key = scan.nextInt();

            result = binarySearch(arr ,key);

            if(result == -1){
                System.out.println("\n" + key + " NOT FOUND!");
            }else{
                System.out.print("\n" + key + " FOUND AT POSITION = " + (result+1));
            }
        }

        scan.close();       
    }   

    static int binarySearch(int[] arr ,int key){
        int high = arr.length-1, low = 0 , mid;

            while(low <= high){
                mid = low + (high - low)/2;

                if(arr[mid] == key){
                    return mid;
                }else if(arr[mid] < key){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            return -1;
    }
}