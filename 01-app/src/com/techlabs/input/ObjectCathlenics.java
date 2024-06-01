package com.techlabs.input;


import java.util.Scanner;

public class ObjectCathlenics {

 public static void main(String[] args) {
  
Scanner scanner =new Scanner(System.in);
System.out.println("Enter matrix values");
int matrix[][]=new int[3][3];
createRow(matrix,scanner);



 }

 

  
 
 private static void createRow(int[][] matrix, Scanner scanner) {
  
  for(int i=0;i<3;i++) {
   createColumn(i,matrix,scanner);
  }
  
 }

 private static void createColumn(int i, int[][] matrix, Scanner scanner) {
 
  for(int j=0;j<3;j++) {
   matrix[i][j]=scanner.nextInt();
     
 }
 }

}

