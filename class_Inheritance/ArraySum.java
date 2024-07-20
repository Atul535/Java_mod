package class_Inheritance;

class Sum
{
	int arr[]= {1,2,3,4,5};
	int sum=0;
	
	int getSum()
	{
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	
}

public class ArraySum {

public static void main(String[] args) {
	
	Sum obj= new Sum();
	int s=obj.getSum();
	System.out.println("Sum of array is : "+s);
}
}
