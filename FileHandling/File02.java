package FileHandling;

import java.io.File;
import java.io.IOException;

public class File02 {
public static void main(String[] args) throws IOException{
	File obj = new File("C:\\Users\\atulm\\OneDrive\\Desktop\\java cybrom\\filehandling\\abcd.txt");
    if(obj.createNewFile())
    {
        System.out.println("File Created");
    }
    else {
        System.out.println("File not created");
    }
}
}
