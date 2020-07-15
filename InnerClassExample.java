package java_practice;

class OuterClass{
	static String name;
	String favoriteSport;
	
	
	static class StaticInnerClass{
		
		public StaticInnerClass() {
			super();
			name = "Ankur";
		}

		void showAccessibleVariables(){
			System.out.println("I am inside static inner class. " + name);
		}
		
	}
	
	public class InnerClass{
		
		public InnerClass() {
			super();
			name = "Ankur";
			favoriteSport= "Chess";
		}

		void showAccessibleVariables(){
			System.out.println("I am inside inner class. "+name+favoriteSport);
		}
	}
}

public class InnerClassExample {
	
	public static void main(String[] args){

		OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass(); //since inner class is static, instance of outer class is not required.
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass(); //to instantiate inner class you need instance of outer class.
		
		staticInnerClass.showAccessibleVariables();
		innerClass.showAccessibleVariables();
	}

}
