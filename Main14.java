//Finding the sum and average of the given 5 array elements

import java.util.Scanner;

public class Main14{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    double sum = 0, avg;
    double[] arr = new double[5];

    System.out.println();
    for(int i=0;i<5;i++){
        System.out.print("Enter DATA " + (i+1) + " = ");
        arr[i] = scan.nextDouble();
        sum += arr[i];
    }

    avg = sum/5;
    System.out.printf("\nSum = %.2f", sum);
    System.out.printf("\nAverage = %.2f", avg);

    scan.close();
    }
}