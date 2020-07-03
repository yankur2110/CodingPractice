package java_practice;

class MyException extends Exception{

	private static final long serialVersionUID = 1L;

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class CustomException {
	
	public static void main(String[] args){
		
		try{
			throw new MyException("error was caught in custom exception class"); 
		}catch(MyException e){
			System.out.println("testing successful");
			System.out.println(e.getMessage());
			
		}
		
	}

}
