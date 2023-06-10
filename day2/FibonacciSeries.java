package week1.day2;

import java.util.Iterator;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int range = 8, firstNum = 0, secNum = 1, sum;
		
		 System.out.println("Output :");
		 
		 System.out.println(firstNum +",");
		 
		 for (int i = 1; i < range; i++) {
			
			 sum=firstNum+secNum;
			 
			 firstNum=secNum;
			 
			 secNum=sum;
			 
			 System.out.println( firstNum + ",");
		}
		
	}

}
