package com.Array1;

import java.util.Scanner;

public class ArmstrongBinary {
public static void main(String[] args) {
	int arr[]= {3,153,44,56,370,371,777,332,1634};
	int sum=0,r=0,c=0;
	for(int i=0; i<=arr.length; i++)
	{
		int t=arr[i];
		while(t>0)
		{
			c++;
			t=t/10;
		}
	    t=arr[i];
		while(t>0)
		{
			r=t%10;
			sum=(int) (sum+Math.pow(r, c));
			t=t/10;
		}
		
		if(arr[i]==sum)
		{
			System.out.print((arr[i]=1)+" ");
		}
		else
			System.out.print((arr[i]=0)+" ");
		System.out.println();
		sum=0;
		c=0;
	}
	
}
}
