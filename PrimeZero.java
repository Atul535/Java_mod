package com.Array1;

public class PrimeZero {
public static void main(String[] args) {
	int arr[]= {23,41,44,31,66,37};
	int c=0;
	int sum=0;
	int s=arr.length;
	
	System.out.print("numbers in array : ");
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.print("Decimal to binary after prime non-prime: ");
	for(int i=0; i<arr.length; i++)
	{	
		int t=arr[i];
		for(int j=2; j<t; j++)
		{
			if(t%j==0)
			{
				c++;
			}
		}
		int trr[]=new int[s];
			if(c==0)
			{
				trr[i]=arr[i];
				System.out.print((trr[i]=1) + " ");
				sum= (int) (sum+(trr[i]*Math.pow(2, (s-1)-i)));
			}
			else
			{
				trr[i]=arr[i];
				System.out.print((trr[i]=0) + " ");
				sum= (int) (sum+(trr[i]*Math.pow(2, (s-1)-i)));
			}
			
		c=0;
	}
		
	System.out.println();
	System.out.println("Sum of all binary converted into decimal : "+sum);
}
}
