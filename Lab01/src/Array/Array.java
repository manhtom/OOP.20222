import java.util.Arrays;

import javax.swing.*;

public class Array {
    public static void main(String[] args){
    int[] input;
    input=input();
    ArrayManipulation arr=new ArrayManipulation(input);
    JOptionPane.showMessageDialog(null,String.format("This is the array you've entered: %s%nThe sorted array is: %s%nSum of all elements in the array is %d%nAverage value of all elements in the array is %.2f%n",arr.displayArray(),Arrays.toString(arr.BubbleSort()),arr.calcSum(),arr.calcAverage()));
    }

private static int[] input(){
    int k=0;
    k=Integer.parseInt(JOptionPane.showInputDialog(null, "You are about to enter an array.\n First, please enter k (number of elements in the array).\nNote: k must be a positive integer number"));
    while (k<=0){
        k=Integer.parseInt(JOptionPane.showInputDialog(null, "k is invalid. Please enter k again.\nNote: k must be a positive integer number"));
        }
    int[] input=new int[k];
    for (int i=1;i<=k;i++){
        int keyboard=Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Please enter the element #%d",i)));
        input[i-1]=keyboard;
        }
    return input;
    }
}
