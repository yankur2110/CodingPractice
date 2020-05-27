import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Rough {
	
	static int count =0;
	
	public static void main(String[] args) throws IOException {
		
        int arr[] = {1,20,6,4,5}; 
        MergeSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr)+ count);
       
	}
	
	public static void MergeSort(int[] arr, int start, int end){
		if(start>=end)
			return;
		int mid=(start+end)/2;
		MergeSort(arr,start,mid);
		MergeSort(arr, mid+1, end);
		Merge(arr,mid,start,end);
	}
	
	public static void Merge(int[] arr, int mid, int start, int end){
		int[] left = Arrays.copyOfRange(arr, start, mid+1);
		int[] right = Arrays.copyOfRange(arr, mid+1, end+1);
		
		int k=start;
		int i=0,j=0;
		int left_length = left.length;
		int right_length = right.length;
		
		while(i<left_length && j<right_length){
			if(left[i]<=right[j]){
				arr[k++]=left[i++];
			}
			else if(left[i]>right[j]){
				arr[k++]=right[j++];
				count = count+mid-i+1;
			}
		}
		if(i==left_length){
			while(j<right_length){
				arr[k++]=right[j++];
			}
		}
		if(j==right_length){
			while(i<left_length){
				arr[k++]=left[i++];
			}
		}
		
	}
	
			
}