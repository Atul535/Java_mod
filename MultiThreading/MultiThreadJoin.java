package MultiThreading;

class Joins extends Thread
{
	public void run()
	{
		String str=Thread.currentThread().getName();
		for(int i=0; i<=5; i++)
		{
			System.out.println("Code "+str+" : "+i);
//			try 
//			{
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//			}
		}
	}
}
public class MultiThreadJoin {
public static void main(String[] args) {
	Joins t1=new Joins();
	Joins t2=new Joins();
	Joins t3=new Joins();
	
	t1.setName("ABC");
	t2.setName("XYZ");
	t3.setName("EFG");
	
	t2.start();
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t1.start();
	
	t3.start();
}
}
