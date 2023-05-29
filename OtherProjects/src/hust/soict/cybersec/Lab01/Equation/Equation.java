//  An equation-solving program. Supports:
//  - Single variable first degree equation
//  - Two variable system of first degree equations
//  - Single variable second degree equation

//  Written by manhtom in April 2023.
//  GUI implemented in Swing

package hust.soict.cybersec.Lab01.Equation;

import javax.swing.*;

public class Equation{
    public static void main(String[] args){
        String option="";
        // get users select type of equation to solve
        while (option.equals("1") == false && option.equals("2") == false && option.equals("3") == false){
            option=JOptionPane.showInputDialog(null, "Select 1 if you want to solve a single variable 1st-degree equation.\nSelect 2 if you want to solve a system of 1st-degree equations with 2 variables.\nSelect 3 if you want to solve a single variable 2nd-degree equation.");
        }

        if (option.equals("1")){
            FirstDegree eqn=new FirstDegree();
            eqn.solveEqn();
        }

        else if (option.equals("2")){
            FirstDegree eqn=new FirstDegree();
            eqn.solveEqnSys();
        }
        
        else{
            SecondDegree eqn=new SecondDegree();
            eqn.solveEqn();
        }
    }
}
