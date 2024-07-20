package com.Array1;

public class MaxMinArray {
public static void main(String[] args) {
	int arr[]= {2,1,4,3,6,7,8,11,9} ;
	int min=arr[0];
	int max= arr[0];
	for (int i=0; i<9; i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	for (int i=0; i<9; i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	System.out.println("Max :" +max);
	System.out.println("Min :" +min);
}
}
