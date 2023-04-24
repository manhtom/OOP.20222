// A program that displays how many days in a month given user input.

//  Written by manhtom in April 2023.
//  GUI implemented in Swing

import javax.swing.*;

public class NumberOfDays {

    public static void main(String[] args) {
        int[] input=input();
        Month.getNumberOfDays(input[0],input[1]);
    }

    private static int[] input() {
        int[] input=new int[2];
        String input1=JOptionPane.showInputDialog(null, "Please enter the month.\nNote: You must either enter the month in its full or its abbreviation/first 3 letters/number.\nFor example, the valid inputs of February are February, Feb., Feb, and 2.");
        while (Month.getMonthIndex(input1) <= 0) { // let users enter until the input is valid
            input1=JOptionPane.showInputDialog(null, "The month you've entered is invalid. Please try again. \nNote: You must either enter the month in full or its abbreviation/first 3 letters/number.\nFor example, the valid inputs of February are February, Feb., Feb, and 2.");
        }
        String input2=JOptionPane.showInputDialog(null, "Please enter the year.\nNote: The year must be a non-negative number with all the digits. For example: the year 1999 must be entered as 1999, not 99.");

        while (Year.checkYear(input2) == false) { // let users enter until the input is valid
                input2=JOptionPane.showInputDialog(null, "The year you've entered is invalid. Please try again.\nNote: The year must be a non-negative number with all the digits. For example: the year 1999 must be entered as 1999, not 99.");
        }
        input[0]=Month.getMonthIndex(input1); //get month numeric index
        input[1]=Integer.parseInt(input2); //convert year input string to int
        return input;
    }
}
    
