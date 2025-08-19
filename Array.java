package ARRAY;

import java.util.Scanner;

public class Array {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=sc.nextInt();
		int []array=new int[limit];
		System.out.println("Enter the elements:");
		for(int i=0;i<limit;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("the array is:");
		for(int num:array) {
			System.out.print(num+"\t");
		}
		int largest=array[0];
		for(int i=0;i<limit;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		System.out.println("\nThe largest element is:"+largest);
		
		
	}

}
