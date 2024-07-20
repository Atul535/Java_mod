package Patterns;

public class Pattern {
public static void main(String[] args) {
	for(int i=1; i<=3; i++ )
	{
		for(int s=0; s<=i-1; s++)
		{
			System.out.print(" ");
		}
		for(int j=5; j>=(2*i)-1; j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
