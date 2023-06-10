package week1.day2;
import java.util.Arrays;
public class MissingElement {
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,7,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i+1]-arr[i]  != 1)  {
				
				int sum=arr[i]+1;
				
				System.out.println("Missing number is: "+sum);
				
				break;
			}
		}
	}

}
