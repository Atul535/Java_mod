package Selection_sort;

public class Sort2 {
public static void main(String[] args) {
	int arr[]= {3,6,4,8,1};
	
	
	
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i]>arr[j])
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		System.out.print(arr[i]+" ");
	}
}
}
