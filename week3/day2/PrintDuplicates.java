package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		  int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};

		  Set<Integer> output=new HashSet<Integer>();
		    int len = arr.length;
		    System.out.println(len);
		    for (int i = 0; i < arr.length-1; i++) {	
		     int count=0;
		    	for (int j = i+1; j < arr.length; j++) {
		    	      if(arr[i]==arr[j]) {
		    	    	  System.out.print(" "+arr[i]);
		    	        	
		    	}
					
				}
				
			}
		 
			}

	}


