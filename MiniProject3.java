//Dice roll program

import java.util.Scanner;
import java.util.Random;

public class MiniProject3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int times, turn, count = 0, i;

        System.out.print("\nHow many times you wanna roll the dice : ");
        times = scan.nextInt();

        if(times > 0){
            for(i = 0; i < times; i++){
                turn = random.nextInt(1,7);
                diceRoller(turn);
                count += turn;
            }
            System.out.println("\nTotal number of point = " + count);
        }else{
            System.out.println("\nYou don't have enough number of dice.");
        }

        scan.close();
    }

    static void diceRoller(int turn){
        String die1 = """
                 ---------
                |         |
                |    *    |
                |         |
                 ---------
                """;
        String die2 = """
                 ---------
                |  *      |
                |         |
                |       * |
                 ---------
                """;
        String die3 = """
                 ---------
                |      *  |
                |    *    |
                |  *      |
                 ---------
                """;
        String die4 = """
                 ---------
                |  *   *  |
                |         |
                |  *   *  |
                 ---------
                """;
        String die5 = """
                 ---------
                |  *   *  |
                |    *    |
                |  *   *  |
                 ---------
                """;
        String die6 = """
                 ---------
                | *    *  |
                | *    *  |
                | *    *  |
                 ---------
                """;

        switch(turn){
            case 1 -> System.out.println(die1 + "\nPoints = " + turn);
            case 2 -> System.out.println(die2 + "\nPoints = " + turn);
            case 3 -> System.out.println(die3 + "\nPoints = " + turn);
            case 4 -> System.out.println(die4 + "\nPoints = " + turn);
            case 5 -> System.out.println(die5 + "\nPoints = " + turn);
            case 6 -> System.out.println(die6 + "\nPoints = " + turn);
        }   
    }
}