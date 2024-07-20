package com.Array1;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size : ");
		int s= sc.nextInt();
		int arr[]=new int[s];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		Arrays.toString(arr);
		
		System.out.println("Sorted elements are : ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
