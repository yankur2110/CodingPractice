package java_practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
	String name() default "AnkurAnnotation";
	int id() default 1;

}


@CustomAnnotation(id = 2, name = "Modified_Custom_Annotation")
class AnnotationTest{
	int marks;
	String result;
	
	public AnnotationTest(int marks, String result) {
		super();
		this.marks = marks;
		this.result = result;
	}
	
	protected int getMarks() {
		return marks;
	}
	protected void setMarks(int marks) {
		this.marks = marks;
	}
	protected String getResult() {
		return result;
	}
	protected void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "AnnotationTest [marks=" + marks + ", result=" + result + "]";
	}
	
	
}

public class UseCustomAnnotation {
	
	public static void main(String[] args){
		
		AnnotationTest obj = new AnnotationTest(8,"pass");
		
		Class<?> c = obj.getClass();
		CustomAnnotation customAnnotation =(CustomAnnotation) c.getAnnotation(CustomAnnotation.class);
		System.out.println("id:"+customAnnotation.id()+"  annotation name:"+customAnnotation.name());
	}

}
