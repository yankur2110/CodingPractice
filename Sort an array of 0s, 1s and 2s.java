import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Rough {
	
	public static void main(String[] args) throws IOException {
		
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sortAccordingly(arr);
        System.out.print(Arrays.toString(arr));
       
	}
	
	public static void sortAccordingly(int[] arr){
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		while(mid<=high){
			switch(arr[mid]){
			
			case 0:{
				swap(arr,low,mid);
				low++;
				mid++;
				break;
			}
			case 1:{
				mid++;
				break;
			}
				
			case 2:{
				swap(arr,mid,high);
				high--;
				break;
			}
			
			}
			
		}
		
	}
	
	public static void swap(int[]arr,int first,int second){
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
	}
	
			
}