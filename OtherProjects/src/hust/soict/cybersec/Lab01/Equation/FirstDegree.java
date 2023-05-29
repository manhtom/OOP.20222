// Java class that implements solving first degree equations/systems of equations.

//  Written by manhtom in April 2023.
//  GUI implemented in Swing
package hust.soict.cybersec.Lab01.Equation;

import javax.swing.*;

public class FirstDegree {
    public FirstDegree(){ 
        //
    }
    public void solveEqn(){ //single variable equation solving
        double a = Float.parseFloat(JOptionPane.showInputDialog(null, "You've selected to solve a single variable 1st-degree equation.\nThe equation to solve will have the form: ax+b=0.\nPlease enter a:"));
        double b = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter b:"));

        if (a==0){
            if (b==0){
                JOptionPane.showMessageDialog(null,"This equation has infinite solutions.");
            }
            else{
                JOptionPane.showMessageDialog(null,"This equation has no solution.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"This equation has a unique solution: "+String.format("%.2f",(-b/a)));
        }
    }
    public static void solveEqn(double a,double b){//single variable equation solving (handling case where a=0 during 2nd-deg equation input)
        JOptionPane.showMessageDialog(null,String.format("As a=0, the equation has become a single variable 1st-deg equation with the form: %.2fx+%.2f=0.\nIt will be solved as any typical single variable 1st-deg equation.",a,b));
        if (a==0){
            if (b==0){
                JOptionPane.showMessageDialog(null,"This equation has infinite solutions.");
            }
            else{
                JOptionPane.showMessageDialog(null,"This equation has no solution.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"This equation has a unique solution: "+String.format("%.2f",(-b/a)));
        }
    }
    public void solveEqnSys(){ // system of equations with 2 variables
        int j=0;
        float[] input=new float[6];
        for (int k=1; k<=2; k++){ // this one is a bit different from above methods as the form of equation is displayed throughout user input process instead of just the first input dialog. 
                                  // system of equations is a bit more complex so this approach helps user feel easier to enter the input
            float temp=Float.parseFloat(JOptionPane.showInputDialog(null,String.format("The equation to solve will have the form:\na1*x+b1*y=c1\na2*x+b2*y=c2\nPlease enter a%d:",k)));
            input[j]=temp;
            j++;
            temp=Float.parseFloat(JOptionPane.showInputDialog(null,String.format("The equation to solve will have the form:\na1*x+b1*y=c1\na2*x+b2*y=c2\nPlease enter b%d:",k)));
            input[j]=temp;
            j++;
            temp=Float.parseFloat(JOptionPane.showInputDialog(null,String.format("The equation to solve will have the form:\na1*x+b1*y=c1\na2*x+b2*y=c2\nPlease enter c%d:",k)));
            input[j]=temp;
            j++;

        }

        // we use Cramer determinant to solve this type of equation
        float D=input[0]*input[4]-input[3]*input[1];
        float Dx=input[2]*input[4]-input[5]*input[1];
        float Dy=input[0]*input[5]-input[3]*input[2];
        // handle the case where at least one equation produces incorrect expression e.g. 0=1
        if ((input[0] == input[1] && input[0] == 0 && input[2] != 0) || (input[3] == input[4] && input[3] == 0 && input[5] != 0)){
            JOptionPane.showMessageDialog(null,"This system of equations has no solution.");
            return;
        }
        if (D==0){
            if (Dx !=0 || Dy !=0){
               JOptionPane.showMessageDialog(null,"This system of equations has no solution.");
            }
            else{
                JOptionPane.showMessageDialog(null,"This system of equations has infinite solutions.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"This system of equations has a unique solution: "+String.format("(%.2f, %.2f)",Dx/D,Dy/D));
        }
    }
}
