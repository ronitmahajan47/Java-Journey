//Sum of first and last digit of a given number

import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num ,last ,first;

        System.out.print("\nEnter a Number : ");
        num = Math.abs(scan.nextInt());

        if(num < 10){
            System.out.println("Please enter non-Single digit number.");
        }else{
            last = num % 10;

            first = num;
            while (first >= 10) {
                first /= 10;
            }

            System.out.println("SUM of first & Last Digits = " + (first + last));
        }

        scan.close();
    }
    
}