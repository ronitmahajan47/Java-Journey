//Checking Armstrong Number

import java.util.Scanner;
public class Main28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num ,temp ,r ,result = 0;

        System.out.print("\nEnter a Number : ");
        temp = num = scan.nextInt();

        if(num < 0){
            System.out.println("Please enter a non-negative number.");
            scan.close();
            return;
        }

        int len = String.valueOf(num).length();

        while(temp!=0){
            r = temp % 10;
            result += Math.pow(r,len);
            temp /= 10;
        }

        if(result == num){
            System.out.println("Your number is an Armstrong number.");
        }else{
            System.out.println("Your number is not an Armstrong number.");
        }

        scan.close();
    }
}