//Selection sorting

import java.util.Scanner;
public class Main30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ,i ,j ,temp ,minindex;

        System.out.print("\nEnter the size of your Array : ");
        n = scan.nextInt();
        
        if(n<0){
            System.out.println("Error! Size of the Array can't be negative...");
        }else if(n==0){
            System.out.println("Your Array is EMPTY!");
        }else{
            int[] arr = new int[n];

            for( i=0;i<n;i++ ){
                System.out.print("Enter DATA " + (i+1) + " = ");
                arr[i] = scan.nextInt();
            }

            System.out.println();

            for( i=0;i<n-1;i++ ){
                minindex = i;
                for( j=i+1;j<n;j++){
                    if(arr[minindex] > arr[j]){
                        minindex = j;
                    }
                }
                if(minindex != i){
                    temp = arr[minindex];
                    arr[minindex] = arr[i];
                    arr[i] = temp;
                }
            }

            System.out.println("Array After Sorting => ");
            for( i=0;i<n;i++ ){
                System.out.print("DATA " + (i+1) + " = ");
                System.out.println(arr[i]);
            }
        }

        scan.close();
    }   
}