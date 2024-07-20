package com.Array1;

public class CopyArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,1,2,3,4,5,6,7};
	int arr1[]= new int[arr.length];
	arr1=arr;
	for(int j=0; j<arr1.length; j++)
	{
		arr1[j]=arr[j];
	}
	System.out.println("Length of array 1 : "+arr.length);
	
	for(int i=0; i<arr1.length; i++)
	{
		System.out.println("Array 2 : "+arr1[i]);
	}
	System.out.println("Length of array 2 : "+arr1.length);
	
	
}
}
