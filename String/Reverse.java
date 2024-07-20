package String;

public class Reverse {
public static void main(String[] args) {
	String str="i am atul mishra";
	int s=str.length();
	for(int i=s-1; i>=0; i-- )
	{
		char ch=str.charAt(i);
		System.out.print(ch);
	}
}
}
