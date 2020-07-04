package java_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CollectionForEach {
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(4);
		list.add(6);
		
		list.forEach(new Consumer<Integer>() {
	        @Override
	        public void accept(Integer id) {
	            System.out.println(id);
	        }
	    });
	}
}
