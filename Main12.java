//Checking String Palindrome

import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original ,rev = "";

        System.out.print("\nEnter a String : ");
        original = scan.nextLine();
        
        for(int i = original.length()-1 ;i>=0 ;i--){
            rev += original.charAt(i);
        }

        if(original.equalsIgnoreCase(rev)){
            System.out.println(original + " is a Palindrome.");
        }else{
            System.out.println(original + " is not a Palindrome.");
        }

        scan.close();
    }
}