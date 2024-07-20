package Patterns;

public class PrimeArm {
public static void main(String[] args) {
	
	int m=100;
	double sums1=0;
	for(int i=1; i<=m; i++)
	{
		
		int n=i;
		int r=0,sum=0,c=0;
		int t=n;
		
		while(t>0)
		{
			c++;
			t=t/10;
		}
		t=n;
		while(t>0)
		{
			r=t%10;
			sum=(int) (sum+Math.pow(r,c));
			t=t/10;
		}
		if(n==sum)
		{
			sums1=sums1+sum;
			System.out.println(sum +" is Armstrong");
		}
	}
	System.out.println();
	
	int cod=0;
	double sums2=0;
	for(int i=1; i<=m; i++)
	{
		int t=i;
		for(int j=2; j<t; j++)
		{
			if(t%j==0)
			{
				cod++;
			}
		}
		if(cod==0)
		{
			sums2=sums2+t;
		    System.out.println(t+ " is prime");
		}
		cod=0;
	}
	System.out.println();
	
	System.out.println("Sum of Armstrong : "+sums1);
	System.out.println("Sum of prime : "+sums2);
	
	double fraction=sums2/sums1;
	System.out.println("Fraction is : "+sums2+"/"+sums1);
	System.out.println("Fraction is : "+fraction);
	
}
}
