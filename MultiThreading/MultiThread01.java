package MultiThreading;

class Mt extends Thread
{
	public void run()
	{
		for(int i=0; i<=50; i++)
		{
			System.out.println("TH : "+i);
		}
	}
}
class Mtb extends Thread
{
	public void run()
	{
		for(int i=0; i<=50; i++)
		{
			System.out.println("THb : "+i);
		}
	}
}
public class MultiThread01 {
public static void main(String[] args) {
	
	Mt ob= new Mt();
	ob.start();
	Mtb ob2= new Mtb();
	ob2.start();
	
	for(int i=0; i<=50; i++)
	{
		System.out.println("Main : "+i);
	}
	
}
}
