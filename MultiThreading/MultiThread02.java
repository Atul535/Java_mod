package MultiThreading;

 class Pattern0002 extends Thread
 {
	 public void run()
	 {
		 for(int i=1; i<=5; i++)
			{
				for(int j=1; j<=5; j++)
				{
					System.out.print("0");
				}
				System.out.println();
			}
	 }
 }

public class MultiThread02 {
public static void main(String[] args) {
	int n=5;
	
	Pattern0002 p=new Pattern0002();
	p.start();
	
	
	
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=5; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
