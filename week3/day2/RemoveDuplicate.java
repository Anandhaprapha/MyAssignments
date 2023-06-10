package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
        char[] CA = text.toCharArray();		
        Set<Character> output=new LinkedHashSet<Character>();
        for (int i = 0; i < CA.length; i++) {
        	output.add(CA[i]);
				} 
		System.out.println(output);

			}	
}
