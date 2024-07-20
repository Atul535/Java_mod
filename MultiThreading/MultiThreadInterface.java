package MultiThreading;

class Multithr implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("Thread : "+i);
		}
		
	}
	
}

public class MultiThreadInterface {
public static void main(String[] args) {
	
	Multithr mt= new Multithr();
	Thread t1= new Thread(mt);
	t1.start();
	
	
	for(int i=0; i<=10; i++)
	{
		System.out.println("main : "+i);
	}
}
}
