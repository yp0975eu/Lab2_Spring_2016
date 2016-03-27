package com.branden;

import java.util.Random;
import java.util.Scanner;

/**
 Problem 2, Rolling a Dice:

 Write a program that simulates rolling a standard 6-sided dice.
 Your program should let the user roll the dice as many times as they like.
  How will you stop your program when the user is done?
 */
public class Problem2 {
    static void run(){
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int roll;
        Random rnd;

        while (true) {
            System.out.println("Roll the dice? Y or N");
            userInput = scanner.nextLine();
            if ( userInput.equalsIgnoreCase("Y") ) {
                rnd  = new Random();
                // random.nextInt(6) returns 0-5;
                roll =  rnd.nextInt(6)+1;
                System.out.println("You rolled "+roll);
            } else {
                System.out.println("The End.");
                break;

            }
        }
    }
}
