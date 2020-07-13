package java_practice;

public class EmployeeForReference implements Cloneable {
	int id;
	String name;
	public EmployeeForReference(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the number
	 */
	protected int getNumber() {
		return id;
	}
	/**
	 * @param number the number to set
	 */
	protected void setNumber(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	protected String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeForReference [number=" + id + ", name=" + name + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	 

}
