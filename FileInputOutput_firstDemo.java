package java_practice;
import java.io.*;

public class FileInputOutput_firstDemo {
	//here myfile.txt has only text abc.
	public static void main(String args[]) throws IOException{
		FileInputStream fos = new FileInputStream("myfile.txt");
		int data = fos.read();
		fos.close();
		System.out.println(data); //output would be 97 because read() reads only single byte at a time that is a in our case which is converted to int.
	}
}
