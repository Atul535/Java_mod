package com.Array1;

public class PrimePalindrome {
public static void main(String[] args) {
	int c=0,sum=0,r=0,t;
	
	for(int i=10; i<=10000; i++)
	{
		t=i;
		for(int j=2; j<i; j++)
		{
			if(t%j==0)
			{
				c++;
			}
		}
		while(t>0)
		{
			r=t%10;
			sum=sum*10+r;
			t=t/10;
		}
		if(i==sum && c==0)
		{
			System.out.println(i+ " is palindrome and prime");
		}
		
		sum=0;
		c=0;
	}
	
	
}
}
