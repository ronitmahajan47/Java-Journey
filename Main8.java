//Weight Convertor using Ternary operator

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter your Weight : ");
        double weight = scan.nextDouble();

        System.out.print("Convert to? (lbs or kgs) : ");
        String choise = scan.next();

        double newWeight = (choise.equalsIgnoreCase("lbs"))? weight * 2.205 : weight / 2.205;

        System.out.printf("\nWeight = %.2f",newWeight);

        scan.close();
    }
}