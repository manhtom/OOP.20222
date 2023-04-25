//  An numeric array manipulation program. Sorting, calculating sum & avg of elements in the array
//  Array inputted by the user.
//  Written by manhtom in April 2023.
//  GUI implemented in Swing

import java.util.Arrays;

import javax.swing.*;

public class Array {
    public static void main(String[] args){
        int[] input;
        input=input();
        ArrayManipulation arr=new ArrayManipulation(input);
        // all results rounded to 2 decimal places
        JOptionPane.showMessageDialog(null,String.format("This is the array you've entered: %s%nThe sorted array is: %s%nSum of all elements in the array is %.2f%nAverage value of all elements in the array is %.2f%n",arr.displayArray(),Arrays.toString(arr.sort()),arr.calcSum(),arr.calcAverage()));
    }

    private static int[] input(){
        int k=0;
        // friendly welcome message
        k=Integer.parseInt(JOptionPane.showInputDialog(null, "You are about to enter an array.\nFirst, please enter k (number of elements in the array).\nNote: k must be a positive integer number"));
        while (k<=0){ // let users input until k is valid
            k=Integer.parseInt(JOptionPane.showInputDialog(null, "k is invalid. Please enter k again.\nNote: k must be a positive integer number"));
        }
        int[] input=new int[k];
        for (int i=1;i<=k;i++){ // entering elements
            int keyboard=Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Please enter the element #%d",i)));
            input[i-1]=keyboard;
        }
        return input;
    }
}
