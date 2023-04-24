//  A program to add two matrices of same size.

//  Written by manhtom in April 2023.
//  GUI implemented in Swing

import javax.swing.*;

public class MatrixAddition {
    public static void main(String[] args) {
        int[] input=inputSize(); // input matrix size
        int row=input[0];
        int col=input[1];
        float[][][] matrix = inputElement(row, col); // input matrix elements
        float[][] a=matrix[0];
        float[][] b=matrix[1];

        String result="";
        for (int i=0;i<row;i++) { //processing the resulting matrix
            for (int j=0;j<col;j++) {
                a[i][j]=a[i][j]+b[i][j];
                result=result+a[i][j];
                result=result+" ";
            }
            result=result+"\n";
        }
        JOptionPane.showMessageDialog(null,String.format("The resulting matrix of adding A and B is%n%s",result));
    }
    
    private static int[] inputSize() {
        int[] input=new int[2];
        String input1=JOptionPane.showInputDialog(null, "You are about to add two matrices. Two matrices must be of the same size and the number of rows or columns must be a positive integer number.\nPlease enter the number of rows:");
        String input2=JOptionPane.showInputDialog(null, "You are about to add two matrices. Two matrices must be of the same size and the number of rows or columns must be a positive integer number.\nPlease enter the number of columns:");
        while (Integer.parseInt(input1) <= 0 || Integer.parseInt(input2) <= 0) { // handle the case where users input a non-positive number of rows/columns
            input1=JOptionPane.showInputDialog(null, "One or more numbers you have entered is invalid. Please try again.\nPlease enter the number of rows:");
            input2=JOptionPane.showInputDialog(null, "One or more numbers you have entered is invalid. Please try again.\nPlease enter the number of columns:");
        }
        input[0]=Integer.parseInt(input1);
        input[1]=Integer.parseInt(input2);
        return input;
    }

    private static float[][][] inputElement(int row, int col) {
        String input;
        float[][][] matrix = new float[2][row][col];
        float[][] a=new float[row][col];
        float[][] b=new float[row][col];
        JOptionPane.showMessageDialog(null, String.format("You will now enter the first matrix (matrix A). The matrix will be of size %d x %d. On being asked, you will enter each element in this matrix.",row,col));
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                input=JOptionPane.showInputDialog(null, String.format("Please enter the element a(%d,%d)",i+1,j+1));
                a[i][j]=Float.parseFloat(input);
            }
        }
        JOptionPane.showMessageDialog(null, String.format("You will now enter the second matrix (matrix B). The matrix will be of size %d x %d. On being asked, you will enter each element in this matrix.",row,col));
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                input=JOptionPane.showInputDialog(null, String.format("Please enter the element b(%d,%d)",i+1,j+1));
                b[i][j]=Float.parseFloat(input);
            }
        }
        matrix[0]=a;
        matrix[1]=b;
        return matrix;
    }
}
