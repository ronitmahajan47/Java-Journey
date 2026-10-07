//Taking sum using Method overloading

import java.util.Scanner;

public class Main15{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in); double a, b, c, d;

    System.out.print("\na = "); 
    a = scan.nextDouble();

    System.out.print("b = "); 
    b = scan.nextDouble();

    System.out.print("c = "); 
    c = scan.nextDouble();

    System.out.print("d = "); 
    d = scan.nextDouble();

    sum(a,b);
    sum(a,b,c);
    sum(a,b,c,d);

    scan.close();
    }

    static void sum(double a, double b) {
        System.out.printf("\nSUM using method 1 = %.2f", (a+b)); 
    }

    static void sum(double a, double b, double c) { 
        System.out.printf("\nSUM using method 2 = %.2f", (a+b+c)); 
    }

    static void sum(double a, double b, double c, double d) { 
        System.out.printf("\nSUM using method 3 = %.2f", (a+b+c+d)); 
    }
}