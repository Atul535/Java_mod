package class_Inheritance;

class Addition
{
	void sum(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum : "+sum);
	}
	
}
class Average extends Addition
{
	void avg(int a, int b)
	{
		double avg=(a+b)/2;
		System.out.println("Average : "+avg);
	}
}

public class Hierarchical {
public static void main(String[] args) {
	
	Average a= new Average();
	a.sum(35, 40);
	a.avg(44, 60);
}
}
