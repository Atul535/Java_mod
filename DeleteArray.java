package com.Array1;
import java.util.*;
public class DeleteArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	int d=3;
	
	for(int i=0; i<arr.length; i++)
	{
		if(d==arr[i])
		{
			for(int j=i; j<arr.length-1; j++)
			{
				arr[j]=arr[j+1];
			}
			break;
		}
	}
	for(int i=0; i<arr.length-1; i++)
	{
		System.out.println(arr[i]+", ");
	}
}
}
