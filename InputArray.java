package com.Array1;
import java.util.*;
public class InputArray {
public static void main(String[] args) {
	int arr[]=new int [5];
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the digit in array : ");
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
		
	}
	
}
}
