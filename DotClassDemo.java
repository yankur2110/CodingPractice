package java_practice;

interface I {
	void show();
}
class Testing implements I{

	@Override
	public void show() {
		System.out.println("I have implemented the methods");
	}

}
public class DotClassDemo {
	public static void main(String[] args){
		
	}

	/*Observations:
	here when I run this source file as java application, 3 .class files will be generated. These are:
	DotClassDemo.class, I.class, Testing.class
	*/

}
