//Basic input program

import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter your Name : ");
        String name = scan.nextLine();

        System.out.print("Enter your Age : ");
        int age = scan.nextInt();

        if(name.isEmpty()){
            name = "Mr. Unknown";
        }

        System.out.println("\nHii "+ name +",");
        if(age>=18){
            System.out.println("You("+ age +") are an Adult.");
        }
        else if(age<18 & age>=0){
            System.out.println("You are Underage.");
        }
        else{
            System.out.println("You are not even born yet.");
        }

        scan.close();
    }
}