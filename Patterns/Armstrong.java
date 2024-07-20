package Patterns;
import java.util.*;
public class Armstrong {
public static void main(String[] args) {
	int n ;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no. :-");
	n=sc.nextInt();
	int t=n;
	int r=0,sum=0,c=0;
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
		System.out.println("Armstrong");
	}
	else
		System.out.println("Not armstrong");
	
}
}
