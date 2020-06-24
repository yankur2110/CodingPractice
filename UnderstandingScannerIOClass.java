package java_practice;

import java.util.Scanner;

public class UnderstandingScannerIOClass {
	
	public static void main(String args[]){
		
		//here System.in is used to create connection between keyboard and the java program.
		//then Scanner object is created to perform read operations.
		Scanner scan_obj = new Scanner(System.in); 
		
		System.out.println("please enter the number:- ");
		//using the object read the input and process it.
		int num=scan_obj.nextInt(); //suppose entered 4.
		scan_obj.close();
		
		System.out.println("number you entered is "+num);//output:- number you entered is 4.
		
	}

}
