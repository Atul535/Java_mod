package Patterns;

public class Swastik {
public static void main(String[] args) {
	int n=7;
	int mid=(n+1)/2;
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n; j++)
		{
			if((i==mid || j==mid)  || (i==1 && j>=mid) || (j==1 && i<=mid) ||
					(j==n && i>=mid) || (j<=mid && i==n))
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
