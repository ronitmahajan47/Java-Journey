//Palindrome number

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int num ,temp ,result = 0 ,rem;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a positive Numbers : ");
        temp = num = scan.nextInt();

        if(num != 0){
            while(temp!=0){
                rem = temp % 10;
                temp /= 10;
                result = (result * 10) + rem;
            }

            if(result == num){
                System.out.println(num + " is a Palindrome Number.");
            }else{
                System.out.println("\n" + num + " is not a Palindrome Number.\nSince Reversed Value = " + result);
            }
        }else{
            System.out.println("ERROR!, Please enter a NON ZERO Number.");
        }

        scan.close();
    }
}