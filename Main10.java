//Sum of digits of a given number

import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num ,sum=0;

        System.out.print("\nEnter a Number : ");
        num = Math.abs(scan.nextInt());

       while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("SUM = " + sum);

        scan.close();
    }
}