package java_practice;

final class ImmutableClass{
	
	private final int numOfSubjects;
	private final String interest;
	private final EmployeeForReference employee;
	
	public ImmutableClass(int numOfSubjects, String interest, EmployeeForReference employee) throws CloneNotSupportedException {
		super();
		this.numOfSubjects = numOfSubjects;
		this.interest = interest;
		this.employee = (EmployeeForReference) employee.clone();
	}

	public int getId() {
		return numOfSubjects;
	}

	public String getInterest() {
		return interest;
	}

	public EmployeeForReference getEmployee() throws CloneNotSupportedException {
		return (EmployeeForReference) employee.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ImmutableClass [numOfSubjects=" + numOfSubjects + ", interest=" + interest + ", employee=" + employee
				+ "]";
	}
	
	
}

public class ImmutableClassDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		EmployeeForReference emp = new EmployeeForReference(703, "Ankur");
		String interest = "sports";
		int numOfSubject =5;
		 
		ImmutableClass immutableclass = new ImmutableClass(numOfSubject, interest, emp);
		System.out.println(immutableclass.toString());
		
		emp.setName("Junior_Ankur");
		System.out.println(immutableclass.toString());
		
		
		
		
	}

}
