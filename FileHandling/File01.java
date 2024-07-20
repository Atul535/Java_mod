package FileHandling;

import java.io.File;
import java.io.IOException;

public class File01 {
public static void main(String[] args) {
    File obj = new File("C:\\Users\\atulm\\OneDrive\\Desktop\\java cybrom\\filehandling\\abc.txt");
   try
   {
       if(obj.createNewFile())
       {
           System.out.println("File Created");
       }
       else {
           System.out.println("File not created");
       }
   }
   catch (IOException ex)
   {
       System.out.println(ex);
   }
}
}
