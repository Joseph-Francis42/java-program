package Matrix;

import java.util.Scanner;

public class Matrix {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and coloum:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]matrix=new int[row][col];
		System.out.println("enter the elements");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
				
			}
			
			
		}
		System.out.println("the matrix is:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+"\t");
				
			}
			System.out.println();
			
		}
		System.out.println("the transpose is:");
		
		for(int i=0;i<col;i++){
			for(int j=0;j<row;j++) {
				System.out.print(matrix[j][i]+"\t");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
