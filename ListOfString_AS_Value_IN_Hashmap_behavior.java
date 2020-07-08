package java_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfString_AS_Value_IN_Hashmap_behavior {
	
	public static void main(String[] args){
		
		/*
		 * This example shows that even if you are sending map<Integer,List<String>> as a parameter to create a new map,
		 * but both map values will be pointing to same list, which is present as values in both the hashmap.
		 */
		Map<Integer, List<String> > map = new HashMap<>();
		List<String> listString = new ArrayList<>();
		listString.add("Ankur");
		listString.add("Neelam");
		listString.add("ankur_junior");
		listString.add("neelam_junior");
		map.put(1, listString);
		
		System.out.println(map);
		
		Map<Integer, List<String>> map2 = new HashMap<>(map);
		map.get(1).add("Added_for_testing");
		System.out.println(map2);
		System.out.println(map);
		
	}

}
