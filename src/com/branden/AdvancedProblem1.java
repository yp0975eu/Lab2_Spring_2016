package com.branden;

/**
 Advanced Problem 1, Strings and Loops:

 A pangram is a sentence that contains all of the letters A through Z. So “The quick brown fox jumps over the lazy dog” is an example. Write a program that uses a loop to decide if a sentence is a pangram or not. Your code should not use 26 if statements!

 */
public class AdvancedProblem1 {
    static void run(){
        String testSentence = "The quick brown fox jumps over the lazy dog";
        char[] lettersInSentence;

        // fill alphabet array  with a loop
        char[] alphabet = new char[26];
        int index = 0;
        for ( char x = 'a';  x <= 'z'; x++, index++){
            alphabet[index] = x;
        }

        // remove spaces from sentence and convert strings to chars
        lettersInSentence = testSentence.toLowerCase().replace(" ", "").toCharArray();

        // array to keep found letters
        int[] found = new int[26];

        // loop through letters in sentence
        for ( int i = 0; i < lettersInSentence.length; i++) {

            // for each letter test to see if it is in the alphabet.
            for (int x = 0; x < alphabet.length; x++) {

                // if it is in the alphabet then increment the found array by one. Each index represents a letter.
                //if any found count is 0 then it wasn't found in the sentence and it's not a pangram

                if (alphabet[x] == lettersInSentence[i]) {

                    found[x]++;
                }
            }
        }

        Boolean isPangram = true;
        for( int x = 0; x < found.length; x++){
            if ( found[x] == 0){
                isPangram = false;
            }
        }
        if ( isPangram ){
            System.out.println("You have a pangram");
        } else{
            System.out.println("nope");
        }

    }
}
