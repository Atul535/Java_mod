package com.Array1;

public class AscDscSum {
public static void main(String[] args) {
	int arr[]= {11,32,22,44,33,67,65};
	
	int t=0;
	int sum1=0,sum2=0;
	System.out.print("Ascending : ");
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i]>arr[j])
			{
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		sum1=sum1+arr[i];
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
	System.out.print("Descending : ");
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i]<arr[j])
			{
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		sum2=sum2+arr[i];
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
	
	System.out.println("Sum of arrays : "+(sum1+sum2));
}
}
