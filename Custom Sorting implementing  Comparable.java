import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("rawtypes")
public class Rough implements Comparable{
	
	private String name;
	private int happinesLevel;
	
	public Rough(){
		
	}

	public Rough(String name, int level){
		this.name=name;
		this.happinesLevel=level;
		
	}
	
	public int compareTo(Object toCompareWithObj) {
		Rough temp = (Rough)toCompareWithObj;
		
		return this.happinesLevel>temp.happinesLevel ?  1 :(this.happinesLevel==temp.happinesLevel ? 0 : -1);
	}
	
	public static void main (String[] args) {

		Rough emp1=new Rough("ankur",8);
		Rough emp2=new Rough("neelam",7);
		Rough emp3=new Rough("ankurJunior",9);
		Rough emp4=new Rough("neelamJunior",8);
		List<Rough> familyChart= new ArrayList<>();
		familyChart.add(emp1);
		familyChart.add(emp2);
		familyChart.add(emp3);
		familyChart.add(emp4);
		
		for(Rough fc:familyChart)
			System.out.println(fc.name+fc.happinesLevel+" ");
		
		Collections.sort(familyChart);
		
		System.out.println("----------After sort-----------");
		
		for(Rough fc:familyChart)
			System.out.println(fc.name+fc.happinesLevel+" ");
		
		
	}
	
	
}