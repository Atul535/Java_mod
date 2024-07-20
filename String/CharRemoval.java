package String;

public class CharRemoval {
public static void main(String[] args) {
	StringBuilder sb= new StringBuilder("i am atul mishra");
	for (int i = 0; i < sb.length(); i++) 
	{
		char ch=sb.charAt(i);
		if(ch=='a')
		{
			ch='b';
		}
		System.out.print(ch);
	}
	
}
}
