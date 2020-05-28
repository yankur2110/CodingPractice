import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Rough {
	
	public static void main(String[] args) throws IOException {
		
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 }; 
	    int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 }; 
        int reqd_platform = findMinPlatformReqd(arr,dep);
        System.out.println(reqd_platform);
       
	}
	
	public static int findMinPlatformReqd(int[] arr,int[] dep){
		
		
		int overall_platform_reqd =0;
		
		for(int i=0;i<arr.length;i++){
			int platform_reqd_curr =1;
			
			for(int j=i+1;j<dep.length;j++){
				
				if(arr[j]>=arr[i]&&arr[j]<=dep[i]  || arr[i]>=arr[j]&&dep[i]<=dep[j])
					platform_reqd_curr++;
				
			}
			overall_platform_reqd = Math.max(overall_platform_reqd, platform_reqd_curr);
			
		}
		
		return overall_platform_reqd;
	}
	
	
			
}