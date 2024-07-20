package String;

public class Count2 {
public static void main(String[] args) {
	StringBuilder sb= new StringBuilder("i am atul mishra");
//	int c=0;
//	for(int i=0; i<sb.length(); i++)
//	{
//			char ch= sb.charAt(i);
//			if(ch!=' ')
//			{
//				for(int j=0; j<sb.length();j++)
//				{
//					c++;
//					sb.append(ch);	
//				}
//				System.out.print(c);
//				c=0;
//			}
//			else
//			{
//								
//				System.out.print(",");
//			}
//	}

	
	
	
//	String inputString = "This is java class";
//
//    String[] words = inputString.split("\\s+");
//
//
//    for (String word : words) 
//    {
//        System.out.println("Length of '" + word + "': " + word.length());
//    }
	
	

	int count[] = new int[150];
	for(int i=0; i<sb.length(); i++)
	{
		char ch=sb.charAt(i);
		if(ch!=' ') 
		{
			count[ch]++;
			System.out.print(count[ch]);
		}
		else
		{
			System.out.print(" ");
		}
	}
}
}
