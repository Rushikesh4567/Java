package com.college;

public class MatrixTest 
{
	 public static void main(String[] args) 
	 {
	     double[][] data1 = {
	         {1, 2, 3},
	         {4, 5, 6}
	     };
	
	     double[][] data2 = {
	         {7, 8, 9},
	         {1, 2, 3}
	     };
	
	     Matrix m1 = new Matrix(data1);
	     Matrix m2 = new Matrix(data2);
	
	     System.out.println("Matrix 1:");
	     m1.print();
	
	     System.out.println("\nMatrix 2:");
	     m2.print();
	
	     System.out.println("\nAddition:");
	     m1.add(m2).print();
	
	     System.out.println("\nSubtraction:");
	     m1.subtract(m2).print();
	
	     System.out.println("\nElement-wise Division:");
	     m1.divide(m2).print();
	
	     System.out.println("\nScalar Multiplication (m1 * 2):");
	     m1.scalarMultiply(2).print();
	
	     double[][] data3 = {
	         {1, 2},
	         {3, 4},
	         {5, 6}
	     };
	     Matrix m3 = new Matrix(data3);
	
	     System.out.println("\nMatrix Multiplication (m1 * m3):");
	     m1.multiply(m3).print();
	
	     System.out.println("\nTranspose of Matrix 1:");
	     m1.transpose().print();
	 }
}
