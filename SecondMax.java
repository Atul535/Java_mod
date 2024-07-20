package com.Array1;

public class SecondMax {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int max=0,max2=0;
	
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>arr[0]) 
		{
			max2=max;
			max=arr[i];
		}
		else if(arr[i]>max2)
		{
			max=arr[i];
		}
	}
	System.out.println("Max : "+max);
	System.out.println("Second Max : "+max2);
}
}
