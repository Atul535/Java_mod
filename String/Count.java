package String;

public class Count {
public static void main(String[] args) {
	String str="I am atul mishra";
	String str2=str+" ";
	int c=0;
	for(int i=0; i<str2.length(); i++)
	{
		char ch= str2.charAt(i);
		
		if(ch==' ')
		{
			
			String word=str2.substring(c, i);
			System.out.println(word+" : "+word.length());
			c=i+1;
		}
		
	}
}
}
