package com.branden;

import java.util.Random;
import java.util.Scanner;

/**
 Start with the last program. Modify it to roll two standard dice and display the value of each dice and the total of both dice.

 Print a message if both dice show the same value.

 (hint… picking a random number between 1 and 12 is not the right approach)
 */
public class Problem3 {
    static void run() {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        int roll1;
        int roll2;
        int total;
        Random rnd;

        while (true) {
            System.out.println("Roll the dice? Y or N");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {

                rnd = new Random();
                roll1 = rnd.nextInt(6) + 1;
                System.out.println("You rolled Dice 1 as: " + roll1);

                roll2 = rnd.nextInt(6) + 1;
                total = roll1 + roll2;

                System.out.println("You rolled Dice 2 as " + roll2);

                if (roll1 == roll2) {
                    System.out.println("You rolled Doubles!");
                }
                System.out.println("The total is " + total);
            } else {

                System.out.println("The End.");
                break;
            }
        }
    }
}