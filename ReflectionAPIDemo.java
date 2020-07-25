package java_practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test{
	@SuppressWarnings("unused")
	private void testMethod(){
		System.out.println("I am inside private test method. ");
	}
}

public class ReflectionAPIDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		
		Class<?> classObject = Class.forName("java_practice.Test");
		Test testObjectUsingClass = (Test)classObject.newInstance();
		
		Method m = classObject.getDeclaredMethod("testMethod");
		m.setAccessible(true);
		m.invoke(testObjectUsingClass);
		
		
	}


}
