//Compound Interest calculator
import java.util.Scanner;

public class Main3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A; //Total accumulated amount
        double CI; //Compound interest

        System.out.print("\nEnter Initial principal amount = ");
        double P = scan.nextDouble();

        System.out.print("\nEnter Annual interest rate(in %) = ");
        double r = scan.nextDouble()/100;

        System.out.print("\nEnter Number of times interest is compounded per year = ");
        int n = scan.nextInt();

        System.out.print("\nEnter Total time of the investment or loan (in years) = ");
        int t = scan.nextInt();

        A = P*(Math.pow((1+r/n),n*t));
        CI = A - P;

        System.out.printf("\nCOMPOUND INTEREST => $%.2f",CI);

        scan.close();
    }
}