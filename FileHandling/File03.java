package FileHandling;

import java.io.*;

public class File03 {
public static void main(String[] args) {
	 File obj = new File("C:\\Users\\atulm\\OneDrive\\Desktop\\java cybrom\\filehandling\\abcd.txt");
     String name = obj.getName();
     System.out.println(name);
     String path1 = obj.getAbsolutePath();
     System.out.println(path1);
     System.out.println(obj.length());
     System.out.println(obj.canRead());
     System.out.println(obj.canExecute());
     System.out.println(obj.delete());
}
}
