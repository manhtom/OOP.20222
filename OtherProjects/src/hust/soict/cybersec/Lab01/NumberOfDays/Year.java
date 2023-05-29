// Java class that implements year validity/leap year checks

//  Written by manhtom in April 2023.
package hust.soict.cybersec.Lab01.NumberOfDays;

public class Year {
    public static boolean checkLeapYear(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        }
        else{ 
            return false;
        }
    }
    public static boolean checkYear(String y) {
        try { 
            int test=Integer.parseInt(y); 
            if (test>=0){ //check if the number is non-negative
            return true;
            }
            else {
                return false;
            }
        } 
        catch (NumberFormatException n) { //handle if the number is not an integer
            return false;
        }
    }
}