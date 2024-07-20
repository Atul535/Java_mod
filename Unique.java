package com.Array1;
public class Unique {
public static void main(String[] args) {
	int arr[]= {1,2,4,2,3,4,2,1,4,4};
	
	for(int i=0; i<arr.length-1; i++)
	{
		if(arr[i]!=arr[i+1])
		{
			System.out.print(arr[i]+" ");
		}
	}
	System.out.println(arr[arr.length]-1);
	
}
}
