package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		int[] num1={3,2,11,4,6,7};
		int[] num2={1,2,8,4,9,7};
		List<Integer> intersec = new ArrayList<Integer>();
	Set<Integer> intersec1=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num1[i]==num2[j]) {					 
					intersec.add(num1[i]);
					intersec1.add(num1[i]);
										
				}
			}
		}
			System.out.println(intersec);
			//System.out.println(intersec1);
			
				
			}
	}

