package com.branden;

import java.util.Scanner;

/*
 Problem 1, Loop Practice:

 Write these loops:

 •	Write a loop that adds up all of the integer numbers between 1 and 100
 •	Write a loop that prints out the integer numbers from 100 down to 1
 •	Write a loop that asks the user to enter 5 positive numbers.

     The user will enter the numbers, one by one.
     Once the user has entered all the numbers, calculate the total and the average value.
 */
public class Problem1 {
    static void run(){

       // •	Write a loop that adds up all of the integer numbers between 1 and 100
        int total = 0;
        for ( int x = 1; x < 100; x++){
            total += x;
        }
        System.out.printf("All numbers between 1 and 100 = %d\n", total);


        // Write a loop that prints out the integer numbers from 100 down to 1
        for ( int x = 100; x > 0; x--){
            System.out.println(x);
        }

        //
        // Write a loop that asks the user to enter 5 positive numbers.
        // The user will enter the numbers, one by one.
        // Once the user has entered all the numbers, calculate the total and the average value.
        //

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 positive numbers");
        total = 0;
        int count = 0;
        int input;
        while (true) {
            input = scanner.nextInt();
            if (input > 0) {
                count++;
                total += input;
            } else {
                System.out.println("You must enter a positive number.");
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println("The total is " + total + " and the average is " + total / 5);
    }

}
