package java_practice;

import java.util.ArrayList;
import java.util.List;

class MyGeneric<T>{
	
	private List<T> list;
	
	public MyGeneric(){
		this.list = new ArrayList<T>();
	}
	
	public void addElement(T element){
		list.add(element);
	}
	
	public void showElements(){
		int size = list.size();
		for(int i=0;i<size;i++){
			System.out.println(list.get(i));
		}
	}
}

public class GenericClassDemo {
	
	public static void main(String[] args){
		MyGeneric<Integer> mygeneric = new MyGeneric<Integer>();
		mygeneric.addElement(1);
		mygeneric.addElement(7);
		mygeneric.addElement(5);
		mygeneric.addElement(9);
//		mygeneric.addElement("ankur"); this line will give you error.
		
		mygeneric.showElements();		
	}

}
