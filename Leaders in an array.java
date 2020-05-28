import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Rough {
	
	public static void main(String[] args) throws IOException {
		
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        findLeaders(arr);
       
	}
	
	public static void findLeaders(int[] arr){
		
		if(arr.length<1)
			System.out.println("no such elements found");
		
		int end =arr[arr.length-1];
		
		int max_so_far=end;
		
		for(int i=arr.length-2; i>=0;i--){
			
			if(arr[i]>max_so_far)
				System.out.println(arr[i]+" is a leader");
			max_so_far=Math.max(arr[i],max_so_far);
		}
		
		
		
		
	}
	
	
			
}