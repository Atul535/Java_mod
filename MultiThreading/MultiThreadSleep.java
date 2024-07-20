package MultiThreading;

class Sleep extends Thread
{
	public void run()
	{
		String str=Thread.currentThread().getName();
		for(int i=0; i<=5; i++)
		{
			System.out.println("Code "+str+" : "+i);
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
public class MultiThreadSleep {
public static void main(String[] args) {
	
	Sleep t1=new Sleep();
	Sleep t2=new Sleep();
	Sleep t3=new Sleep();
	
	t1.setName("ABC");
	t2.setName("XYZ");
	t3.setName("EFG");
	t1.start();
	t2.start();
	t3.start();
}
}
