package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
		
		public static void main(String[] args) {
			// Here is the input
			         int[] arr = {1,2,3,4,7,6,8};
			         int count=0;
					List<Integer> nums=new ArrayList<Integer>();
					for (int i = 0; i < arr.length; i++) {
						nums.add(arr[i]);
						if (arr[i]==i+1) {
							count++;
						}	
		}
					Collections.sort(nums);		
					System.out.println(nums);
					System.out.println("The missing element is: "+count);
		}
}
