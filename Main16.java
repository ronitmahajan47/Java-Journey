//Fibonicci series

import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, i ,a=0 ,b=1, c;

        System.out.print("\nEnter total number of terms for a Fibonicci Series = ");
        num = scan.nextInt();

        System.out.println("\nFibonicci Series : ");
        for(i=0; i<=num ;i++){
            System.out.print(a + "  ");
            c = a + b;
            a = b;
            b = c;
        }

        scan.close();
    }
}