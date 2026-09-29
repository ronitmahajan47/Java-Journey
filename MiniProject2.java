//Guess the number game

import java.util.Random;
import java.util.Scanner;

public class MiniProject2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int ranVal, userVal = -1;
        ranVal = random.nextInt(1,101);

        System.out.println("\nGUESS THE RANDOM NUMBER BETWEEN 1 TO 100 =>");
        while(userVal != ranVal){
            System.out.print("\nEnter a number : ");
            userVal = scan.nextInt();

            if(userVal == ranVal){
                System.out.print("\nCongratulations you WON the game!");
            }else if(userVal < ranVal){
                System.out.println("Your number is Smaller...");
            }else{
                System.out.println("Your number is Greater...");
            }
        }

        scan.close();
    }
}