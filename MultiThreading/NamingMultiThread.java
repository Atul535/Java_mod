package MultiThreading;

class mt04 extends Thread{

    void show()
    {
        String str = Thread.currentThread().getName();
        for(int i=1; i<=50; i++)
        {
            System.out.println(str + i);
        }
    }
    public void run()
    {
        show();
    }
}

public class NamingMultiThread {
public static void main(String[] args) {
	 mt04 t1 = new mt04();
     mt04 t2 = new mt04();
     mt04 t3 = new mt04();

     t1.setName("RAMAN");
     t2.setName("RAMA");
     t3.setName("RAM");

     t1.start();
     t2.start();
     t3.start();
     

     for(int i=1; i<=50; i++)
     {
         System.out.println("main " + i);
     }
}
}
