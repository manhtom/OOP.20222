//import java.util.*;
import javax.swing.*;

//this method is implemented with javax.swing

public class SecondDegree {
    public static void solveEqn(){ 
        double a=Double.parseDouble(JOptionPane.showInputDialog(null,"You've selected to solve a single variable 2nd-degree equation. The equation form is ax^2+bx+c=0.\n Please enter the coefficient a:"));
        double b=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the coefficient b: "));
        double c=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the coefficient c: "));
        if (a!=0){
            double delta=Math.pow(b,2)-4*a*c; // math.pow returns a double
            if (delta<0){
                JOptionPane.showMessageDialog(null, "This equation has no real roots.");
            }
            else if (delta==0){
                JOptionPane.showMessageDialog(null,  "This equation has double roots: "+String.format("%.2f",-b/(2*a))); //rounded to 2 decimal places
            }
            else{
                JOptionPane.showMessageDialog(null,  "This equation has two unique roots: "+String.format("(%.2f, %.2f)",(-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a))); //rounded to 2 decimal places
            }
        }
        else{
            FirstDegree.solveEqn(b,c); // handle the case where a==0
        }
    }
}

