package String;

public class RepeatCount {
public static void main(String[] args) {
	String str="aaabbbbdddddeeff";
	int[] c=new int[300];
	for(int i=0; i<str.length(); i++)
	{
		char ch=str.charAt(i);
		c[ch]++;
	}
	for(int i=0; i<c.length; i++)
	{
		if(c[i]>0)
		{
			System.out.print((char)i+""+c[i]+" ");		
		}
	}
//	int c=0;
//	char ch= str.charAt(0);
//	for(int i=0; i<str.length(); i++)
//	{
//		if(ch==str.charAt(i))
//		{
//			c++;
//			System.out.println(ch+""+c);
//		}
//		else
//		{
//			ch=str.charAt(i);
//		}
//		c=0;
//	}
}
}
