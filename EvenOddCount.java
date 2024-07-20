package com.Array1;

public class EvenOddCount {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	int ec=0,oc=0;
	
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]%2==0)
		{
			ec++;
		}
		else
		oc++;
	}
	System.out.println("Even count : "+ec);
	System.out.println("Odd count : "+oc);
}
}
