package Patterns;

public class Ulta_Nepal {
public static void main(String[] args) {
	for(int i=1; i<=5; i++)
	{
		for(int k=0; k<=i-1; k++)
		{
			System.out.print("  ");
		}
			
		for(int j=5; j>=i; j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
