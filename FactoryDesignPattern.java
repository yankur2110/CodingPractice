package java_practice;

interface Shape{
	void draw();
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am drawing circle.");
	}
}

class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("I am drawing square.");
	}
	
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am drawing rectangle.");
	}
	
}

class Default implements Shape{

	@Override
	public void draw() {
		System.out.println("I am drawing the default shape.");
	}
	
}

class ShapeFactory{
	
	Shape getShape(String str){
		
		if(str.equals("CIRCLE"))
			return new Circle();
		else if(str.equals("RECTANGE"))
			return new Rectangle();
		else if(str.equals("SQUARE"))
			return new Square();
		return new Default();
	}
}

public class FactoryDesignPattern {
	
	public static void main(String[] args){
		ShapeFactory shapeFactory = new ShapeFactory();
		/*
		 * Here we are not actually calling a class, it is handled by factory.
		 * We are just providing the name like CIRCLE,RECTANGE.SQUARE etc.
		 */
		Shape customShapeUsingFactory = shapeFactory.getShape("CIRCLE");
		customShapeUsingFactory.draw();
		System.out.println("You successfully completed factory design pattern demo.");
	}

}
