//Temperature Converter

import java.util.Scanner;

public class Main7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nTemperature Converter =>");
        System.out.println("1. Celsius --> Fahrenheit");
        System.out.println("2. Fahrenheit --> Celsius");
        System.out.print("\nEnter your Choice (1 or 2) : ");
        int choice = scan.nextInt();

        if(choice == 1){
            System.out.print("\nEnter Temperature in Celsius : ");
            double temp = scan.nextDouble();

            double newTemp = (temp * 9/5) + 32;
            System.out.printf("Temperature in Fahrenheit = %.2f",newTemp);
        }else if(choice == 2){
            System.out.print("\nEnter Temperature in Fahrenheit : ");
            double temp = scan.nextDouble();

            double newTemp = (temp - 32) * 5/9 ;
            System.out.printf("Temperature in Celsius = %.2f",newTemp);
        }else{
            System.out.print("\nInvalid Choice");
        }

        scan.close();
    }
}