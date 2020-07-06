package java_practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapBasedOnValues{
	
	public static void main(String[] args){
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Cvalue");
		map.put(2, "Avalue");
		map.put(3, "Dvalue");
		map.put(4, "Bvalue");
		System.out.println(map);
		
		
		List<Map.Entry<Integer, String>> collectionViewOfMap = new LinkedList<>(map.entrySet());
		Collections.sort(collectionViewOfMap, new Comparator<Map.Entry<Integer, String>>(){

			@Override
			public int compare(Map.Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		}
		);
		
		Iterator<Map.Entry<Integer, String>> iterator = collectionViewOfMap.iterator();
		LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		
		while(iterator.hasNext()){
			Map.Entry<Integer, String> mapValue=iterator.next();
			linkedHashMap.put(mapValue.getKey(), mapValue.getValue());
			
		}
		
		System.out.println(linkedHashMap);
		
		
		
	}
}