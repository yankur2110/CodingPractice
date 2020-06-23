package java_practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteToTextFile {
	
	public static void main(String[] args) throws FileNotFoundException{
	
	FileOutputStream fos = new FileOutputStream("myfile.txt");
	PrintWriter pw = new PrintWriter(fos);
	pw.println("first demo to write in a file");
	pw.close();
	}

}
