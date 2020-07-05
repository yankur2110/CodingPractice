package java_practice;

class CustomRuntimeException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CustomRuntimeException(String message) {
		super(message);
	}
	
	
}

class CustomException_Checked extends Exception{
	private static final long serialVersionUID = 1L;

	public CustomException_Checked(String message) {
		super(message);
	}
	
}

public class CustomCheckedAndUncheckedException {
	
	static void method1() throws CustomException_Checked{
		throw new CustomException_Checked("custom checked exception"); 
	}
	
	static void method2() {
		throw new CustomRuntimeException("custom runtime/unchecked exception");
	}
	
	private static void method_for_custom_checked() throws CustomException_Checked {
		method1();	
	}

	private static void method_for_custom_unchecked() {
		method2();
	}

	public static void main(String[] args){
		try {
			method_for_custom_checked();
		} catch (CustomException_Checked e) {
			System.out.println(e.getMessage());
		}	
		
		
		method_for_custom_unchecked();
	}



}
