package String;

public class Toggle {
public static void main(String[] args) {
	String str="CyBrOm";
	
	for(int i=0; i<str.length(); i++)
	{
		char ch=str.charAt(i);
		
		if((int)(ch)>=65 && (int)(ch)<=91)
		{
			System.out.print((char)(ch+32));
		}
		else if((int)(ch)>=97 && (int)(ch)<=122)
		{
			System.out.print((char)(ch-32));
		}
		
	}
}
}
