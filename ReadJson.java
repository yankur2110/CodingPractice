package java_practice;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	
	public static void main(String[] args){
		
		 JSONParser parser = new JSONParser();
		 
		 try{
			 
			 Object obj = parser.parse(new FileReader("MyFile.json"));
			 
			 /* MyFile.json has data {"menu": "ankur"}} */
			 
			 JSONObject jsonObject = (JSONObject) obj;
			 String str1 = (String) jsonObject.get("menu");
			 System.out.println(str1);  //ankur
			 
		 }catch(FileNotFoundException e){
			 System.out.println("FILE NOT FOUND EXCEPTION");
			 e.printStackTrace();
		 }catch(IOException e){
			 System.out.println("IO EXCEPTION");
			 e.printStackTrace();
		 }catch(ParseException e){
			 System.out.println("PARSE EXCEPTION");
			 e.printStackTrace();
		 }catch(Exception e){
			 System.out.println("EXCEPTION");
			 e.printStackTrace();
		 }
		 
	}
	
}
