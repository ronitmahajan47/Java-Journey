//Swapping using the 3rd variable

import java.util.Scanner;

public class Main4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  

        System.out.print("\nEnter your 1st number : ");
        int a = scan.nextInt();
        
        System.out.print("Enter your 2nd number : ");
        int b = scan.nextInt();

        System.out.print("\nBEFORE SWAPPING:\na = " + a + " " + "b = "+ b);

        int temp = a;
        a = b;
        b = temp;

        System.out.print("\nAFTER SWAPPING:\na = " + a + " " + "b = "+ b);

        scan.close();
    }
}