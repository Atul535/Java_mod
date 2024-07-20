package Methods;

public class Prime {

	static int IsPrime(int x)
    {
        int c=0;
        for(int i=2; i<x; i++)
        {
            if(x%i==0)
                c++;
        }
        if(c==0)
            return  1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int arr[] = {12,29,19,34,45,56,67,77,89,81,91,13};
        for(int i=0; i<arr.length; i++)
        {

            arr[i] = IsPrime(arr[i]);
        }

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "  ");

    }
}
