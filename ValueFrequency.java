package com.Array1;

public class ValueFrequency {
public static void main(String[] args) {
	int arr[]= {1,2,3,3,4,2,3,4,2,1,4,4};
	int fr[]= new int [arr.length];
	//int visited=-1;
//	for(int i=0; i<arr.length; i++)
//	{
//		int count =1;
//		for(int j=i+1; j<arr.length; j++)
//		{
//			if(arr[i]==arr[j])
//			{
//				count++;
//				fr[j]=visited;
//			}
//			if(fr[i]!=visited)
//			{
//				fr[i]=count;
//			}
//			
//		}
//		
//	}
//	for(int i=0; i<arr.length; i++)
//	{
//		if(fr[i]!=visited)
//		{
//			System.out.println(arr[i]+" = "+fr[i]+" times");
//		}
//	}
	for(int i=0; i<arr.length; i++)
	{
		int count=1;
		if(fr[i]!=1)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fr[j]=1;
;				}
			}
			System.out.println(arr[i]+" = "+count+" times");
		}
	}
}
}
