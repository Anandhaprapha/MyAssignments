package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	
		String input="changeme";
		
	    char[] charArray = input.toCharArray();
	    
	    System.out.println("Print Odd index to UpperCase");
	    
	    for(int i=0;i<charArray.length;i++)
	    {
	    	if(i%2!=0)
	    	{
	    		char output=Character.toUpperCase(charArray[i]);
	    		
				System.out.print(output);
			}
	    	else System.out.print(charArray[i]);
	    	
	    	
	    }
	}
}
