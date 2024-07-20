package FileHandling;

import java.io.*;

public class File05 {
public static void main(String[] args) throws FileNotFoundException {
	//Read File
	FileReader ob = new FileReader("C:\\Users\\atulm\\OneDrive\\Desktop\\java cybrom\\filehandling\\abcd.txt");
    int a;
    try {
        while ((a = ob.read()) != -1)
        {
            System.out.print((char)a);
        }
    }
    catch (IOException ee)
    {
        System.out.println(ee);
    }
}
}
