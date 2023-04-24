public class Year {
    public static boolean checkLeapYear(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        }
        else{ return false;
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