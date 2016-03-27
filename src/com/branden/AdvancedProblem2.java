package com.branden;

import java.util.Scanner;

/**
 Problem 2, Delivery Company:

 A parcel delivery company charges the following rates to ship a parcel.

 Up to 5 pounds: $2.45 per pound
 Up to 10 pounds: $2.15 per pound
 Up to 15 pounds: $1.95 per pound
 Up to 20 pounds: $1.55 per pound
 Up to 30 pounds: $1.15 per pound

 The shipping company does not ship parcels that weigh over 30 pounds.

 So, a parcel that weighs 17 pounds will cost $1.55 x 17 = $26.35.

 Write a program that asks the user for the weight of a parcel and displays whether it can be shipped, and what it will cost.
 */
public class AdvancedProblem2 {
    static void run(){
        Scanner scanner = new Scanner( System.in);
        System.out.println("Enter a weight");
        double weight, cost, totalCost;

        while( !scanner.hasNextDouble() ){
            System.out.println("Please enter a valid number to the 100s place. Example: 1.00");
            scanner.next();
        }
        weight = scanner.nextDouble();


        if ( weight <= 30.00){
            cost = 0;
            if( weight < 5.0){
                cost = 2.45;
            }
            else if ( weight >5.0 && weight <= 10.0){
                cost = 2.45;

            }
            else if ( weight >10.0 && weight <= 15.0){
                cost = 2.15;

            }
            else if ( weight > 15.0 && weight <= 20.0){
                cost = 1.95;

            }
            else if ( weight >20.0 && weight <= 25.0){
                cost = 1.55;

            }
            else if ( weight >25.0 && weight <= 30.0){
                cost = 1.15;

            }
            totalCost = cost * weight;

            String formatString = String.format("A parcel that weighs %.2f pounds will cost $%.2f x %.2f = $%.2f", weight, cost,weight, totalCost);

            System.out.println(formatString);


        }else{
            System.out.println("You cannot ship that.");
        }

    }
}
