package com.Array1;

public class ArraySum {
public static void main(String[] args) {
	int arr[]= {11,22,33,44,55};
	int s=arr.length;
	int brr[]= {55,44,33,22,11};
	int trr[]=new int[s];
	
	for(int i=0; i<=arr.length; i++)
	{
		for(int j=0; j<=brr.length; j++)
		{
			for(int k=0; k<=s; k++)
			{
				trr[k]=arr[i]+brr[j];
				if(k<s-1)
				{
					System.out.print(trr[k]+" , ");
				}
				else
					System.out.print(trr[k]+" ");
			}
		}
	}
}
}
