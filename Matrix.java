package com.college;

public class Matrix 
{
 private int rows;
 private int cols;
 private double[][] data;

 
 public Matrix(int rows, int cols) 
 {
     this.rows = rows;
     this.cols = cols;
     data = new double[rows][cols];
 }


 public Matrix(double[][] data) 
 {
     this.rows = data.length;
     this.cols = data[0].length;
     this.data = new double[rows][cols];
     for (int i = 0; i < rows; i++) 
     {
         for (int j = 0; j < cols; j++) 
         {
             this.data[i][j] = data[i][j];
         }
     }
 }


 public Matrix add(Matrix other) 
 {
     if (this.rows != other.rows || this.cols != other.cols) 
     {
         throw new IllegalArgumentException("Matrix dimensions must match for addition!");
     }
     Matrix result = new Matrix(rows, cols);
     for (int i = 0; i < rows; i++) 
     {
         for (int j = 0; j < cols; j++) 
         {
             result.data[i][j] = this.data[i][j] + other.data[i][j];
         }
     }
     return result;
 }


 public Matrix subtract(Matrix other) 
 {
     if (this.rows != other.rows || this.cols != other.cols) 
     {
         throw new IllegalArgumentException("Matrix dimensions must match for subtraction!");
     }
     Matrix result = new Matrix(rows, cols);
     for (int i = 0; i < rows; i++) 
     {
         for (int j = 0; j < cols; j++) 
         {
             result.data[i][j] = this.data[i][j] - other.data[i][j];
         }
     }
     return result;
 }


 public Matrix multiply(Matrix other) 
 {
     if (this.cols != other.rows) 
     {
         throw new IllegalArgumentException("Invalid dimensions for multiplication!");
     }
     Matrix result = new Matrix(this.rows, other.cols);
     for (int i = 0; i < this.rows; i++) 
     {
         for (int j = 0; j < other.cols; j++) 
         {
             for (int k = 0; k < this.cols; k++) 
             {
                 result.data[i][j] += this.data[i][k] * other.data[k][j];
             }
         }
     }
     return result;
 }


	 public Matrix divide(Matrix other) 
	 {
	     if (this.rows != other.rows || this.cols != other.cols) 
	     {
	         throw new IllegalArgumentException("Matrix dimensions must match for division!");
	     }
	     Matrix result = new Matrix(rows, cols);
	     for (int i = 0; i < rows; i++) 
	     {
	         for (int j = 0; j < cols; j++) 
	         {
	             if (other.data[i][j] == 0) throw new ArithmeticException("Division by zero in matrix element!");
	             result.data[i][j] = this.data[i][j] / other.data[i][j];
	         }
	     }
	     return result;
	 }


	 public Matrix scalarMultiply(double scalar) 
	 {
	     Matrix result = new Matrix(rows, cols);
	     for (int i = 0; i < rows; i++) {
	    	 
	         for (int j = 0; j < cols; j++) 
	         {
	             result.data[i][j] = this.data[i][j] * scalar;
	         }
	     }
	     return result;
	 }


	 public Matrix transpose() 
	 {
	     Matrix result = new Matrix(cols, rows);
	     for (int i = 0; i < rows; i++) 
	     {
	         for (int j = 0; j < cols; j++) 
	         {
	             result.data[j][i] = this.data[i][j];
	         }
	     }
	     return result;
	 }


	 public void print() 
	 {
	     for (int i = 0; i < rows; i++) 
	     {
	         for (int j = 0; j < cols; j++) 
	         {
	             System.out.print(data[i][j] + "\t");
	         }
	         System.out.println();
	     }
	 }
}

