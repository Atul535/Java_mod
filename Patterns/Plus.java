package Patterns;

public class Plus {
public static void main(String[] args) {
	int n=7;
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n; j++)
		{
			if(i==(n-(n/2)) || j==(n-(n/2)) )
			{
				System.out.print("* ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}