//import java.util.*;
import javax.swing.*;

public class Calculate {
    public static void main(String[] args) {
        //friendly welcome message
        JOptionPane.showMessageDialog(null,"You are about to enter 2 double numbers (called a and b).\nAfter that, we will display the sum, difference, product and quotient of a and b, rounded to 2 decimal places."); 
        double a=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter a:"));
        double b=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter b:"));
        double sum=a+b;
        double diff=a-b;
        double prod=a*b;
        if (b!=0) { // display the results rounded to 2 decimal places
            double quoti=a/b;
            JOptionPane.showMessageDialog(null, String.format("The sum of a and b is %.2f\nThe difference of a and b is %.2f\nThe product of a and b is %.2f\nThe quotient of a and b is %.2f",sum,diff,prod,quoti)); 
            ; 
        }
        else { // handle the case where divisor = 0
            JOptionPane.showMessageDialog(null, String.format("The sum of a and b is %.2f\nThe difference of a and b is %.2f\nThe product of a and b is %.2f\nThe quotient of a and b is undefined because the divisor is equal to 0",sum,diff,prod)); 
        }
    }
}
