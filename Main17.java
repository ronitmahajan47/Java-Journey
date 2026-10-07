//Pattern

import java.util.Scanner;
public class Main17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num ,i ,j;

        System.out.print("\nEnter total number of columns for a pattern = ");
        num = scan.nextInt();

        System.err.println();
        for(i=1 ; i<=num ; i++){
            for(j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.err.println();
        }

        scan.close();
    }
}