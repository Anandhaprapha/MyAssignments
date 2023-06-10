package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Google {

	public static void main(String[] args) {

		String input="google";
		
		String output="";
		
		char[] charArray = input.toCharArray();
		
        Set<Character> unique=new LinkedHashSet<Character>();
         for (int i = 0; i < charArray.length; i++) {
        	 
        	 if (unique.add(charArray[i])) {
				
			     output=output+charArray[i];
			
		}
	}
       System.out.println(output);

}
	
}