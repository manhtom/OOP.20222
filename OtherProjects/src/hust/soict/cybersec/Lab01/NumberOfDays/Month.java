// Java class that implements various functions relating to calendar month

//  Written by manhtom in April 2023.
//  GUI implemented in Swing
package hust.soict.cybersec.Lab01.NumberOfDays;

import javax.swing.*;

public class Month {
    public static int getMonthIndex(String m){ // check month input validty and return numeric index of a month if valid
        if (m.equals("Jan") || m.equals("Jan.") || m.equals("January") || m.equals("1")){
            return 1;
        }
        else if (m.equals("Feb") || m.equals("Feb.") || m.equals("February") || m.equals("2")){
            return 2;
        }
        else if (m.equals("Mar") || m.equals("Mar.") || m.equals("March") || m.equals("3")){
            return 3;
        }
        else if (m.equals("Apr") || m.equals("Apr.") || m.equals("April") || m.equals("4")){
            return 4;
        }
        else if (m.equals("May") || m.equals("May.") || m.equals("May") || m.equals("5")){
            return 5;
        }
        else if (m.equals("Jun") || m.equals("Jun.") || m.equals("June") || m.equals("6")){
            return 6;
        }
        else if (m.equals("Jul") || m.equals("Jul.") || m.equals("July") || m.equals("7")){
            return 7;
        }
        else if (m.equals("Aug") || m.equals("Aug.") || m.equals("August") || m.equals("8")){
            return 8;
        }
        else if (m.equals("Sep") || m.equals("Sep.") || m.equals("September") || m.equals("9")){
            return 9;
        }
        else if (m.equals("Oct") || m.equals("Oct.") || m.equals("October") || m.equals("10")){
            return 10;
        }
        else if (m.equals("Nov") || m.equals("Nov.") || m.equals("November") || m.equals("11")){
            return 11;
        }
        else if (m.equals("Dec") || m.equals("Dec.") || m.equals("December") || m.equals("12")){
            return 12;
        }
        else{
            return -1;
        }
    }
    public static void getNumberOfDays(int m, int y) {
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            JOptionPane.showMessageDialog(null, "There are 30 days in this month.");
        }
        else if (m==2) {
            if (Year.checkLeapYear(y)) {
                JOptionPane.showMessageDialog(null, "There are 29 days in this month.");
            }
            else {
                JOptionPane.showMessageDialog(null, "There are 28 days in this month.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "There are 31 days in this month.");
        }
    }
}
