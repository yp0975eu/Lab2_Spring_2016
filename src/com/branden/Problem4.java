package com.branden;

import java.util.Random;

/**
 Start with the switch program from the slides.
 This generates one random number and uses a case statement to print a different message, depending on the number's value.
 Please modify this program so it generates a million random numbers, and keeps track of how many 0s, 1s, 2s, 3s, and 4s were generated.
 If the random number generator was truly random, you should expect about 200k (1 million / 5) of each number. Is that what you get?
 */
public class Problem4 {
    static void run() {
        int[] counter = new int[5];

        System.out.println("Testing the random number generator");

        final int oneMillion = 1000000;

        for (int x = 0; x < oneMillion; x++) {

            Random rng = new Random(); // rng = random number generator
            // This should pick an integer in the range 0 to 4 (so 0 to (5 minus 1)).

            int randomChoice = rng.nextInt(5);
            switch (randomChoice) {
                case 0:
                    counter[0]++;
                    break;
                case 1:
                    counter[1]++;
                    break;
                case 2:
                    counter[2]++;
                    break;
                case 3:
                    counter[3]++;
                    break;
                case 4:
                    counter[4]++;
                    break;
                default:
                    //This happens if none of the other cases are true
                    System.out.println("Wrong chose something else:" + randomChoice);
            }
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "'s: " + counter[i]);
        }

    }
}