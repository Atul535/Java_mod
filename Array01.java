package com.Array1;

public class Array01 {
public static void main(String[] args) {
	int arr[]= {2,3,4,5,6};
	int arr1[]= {-2,-3,-4,-5,-6};
	int sum=0;

	for(int i=0; i<arr.length;i++)
	{
		System.out.println(arr[i]);
		sum=sum+arr[i];
	}
	System.out.println("Sum of array : "+sum);
	for(int i=0; i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
}

}
