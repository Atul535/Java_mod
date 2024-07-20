package FileHandling;

import java.io.*;

public class File04 {
public static void main(String[] args) throws IOException {
	  File fl = new File("C:\\Users\\atulm\\OneDrive\\Desktop\\java cybrom\\filehandling\\t01.txt");
      if(fl.createNewFile())
      {
          System.out.println("File created");
      }
      else
      {
          System.out.println("File not created");
      }
}
}
