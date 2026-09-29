//Calculator

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1,num2;
        String operator;

        System.out.print("\nEnter your First Number = ");
        num1 = scan.nextDouble();

        System.out.print("\nEnter an Operator (+,-,*,/) = ");
        operator = scan.next();

        System.out.print("\nEnter your Second Number = ");
        num2 = scan.nextDouble();
        
        switch(operator){
            case "+" -> System.out.printf("\nResult = %.2f", num1 + num2);
            case "-" -> System.out.printf("\nResult = %.2f", num1 - num2);                
            case "*" -> System.out.printf("\nResult = %.2f", num1 * num2);
            case "/" -> {
                if(num2 != 0){
                    System.out.printf("\nResult = %.2f", num1 / num2);
                }else{    
                    System.out.println("\nError: Cannot divide by zero!");
                }
            }
            default -> System.out.print("\nError: Invalid Operator!");
        }

        scan.close();
    }
}