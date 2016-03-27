package com.branden;

/**

 Problem 6, Debugging:

 Add a breakpoint to the start of one of your programs. Debug it, and then use the debugger to step through your program, and inspect the value of the variables.
 */
public class Problem6 {
    static void run(){
        System.out.println("Q: How do you add a breakpoint? How can you remove a breakpoint?\n" +
                "\tYou add a breakpoint by clicking on the gutter near the line number. To remove it you click again.\n\n" +
                "Q: Can you add more than one breakpoint?\n" +
                "\tYes, each line can have a breakpoint.\n" +
                "\n" +
                "Q: How do you activate and deactivate breakpoints?\n" +
                "\tYou activate and deactivate by right clicking and selecting activate.\n" +
                "\n" +
                "Q: How do you move through your code one line at a time?\n" +
                "\tBy clicking the step over button.\n" +
                "\n" +
                "Q: How do you see the value of a variable?\n" +
                "\tBy highlighting and then hovering over the variable.\n" +
                "\n" +
                "Q: What does clicking on the triangle next to a variable on the variables pane do? (Such as the arrow next to names in the screenshot below)\n" +
                "\tIt expands the variable so you can see what’s inside.");
    }
}
