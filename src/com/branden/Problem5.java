package com.branden;

import java.util.Scanner;

/**
 Write a program that displays a pyramid of stars of any height.
 The user should be able to enter a height, and your program will use loops to display a pyramid. So, if the user enters 4, your program will display

 *
 ***
 *****
 *******

 */
public class Problem5 {
    static void run(){
        int userInput;
        System.out.println("Enter the number of rows.");
        Scanner scanner = new Scanner(System.in);
        while( !scanner.hasNextInt() ){
            System.out.println("Please enter a number");
            scanner.next();
        }
        userInput = scanner.nextInt();
        int starsInRow;
        int spaces;
        for ( int row = 1; row <= userInput; row++){
            starsInRow = userInput - (userInput -row );
            spaces = userInput - row;


            for( int i = 0; i < spaces; i++){
                System.out.print("");

            }
            for( int i = 0; i < starsInRow; i++){
                System.out.print("*");

            }

            for( int i = 0; i < spaces; i++){
                System.out.print("");

            }
            System.out.println("");
        }

    }
}
