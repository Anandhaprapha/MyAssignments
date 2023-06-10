package week1.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num=24242;
		int input=num;
		int output=0,rem;
		
		for (num=24242; num>0; num=num/10) {
			
			rem=num%10;
			
			output=output*10+rem;
		}
		
		if (input==output) {
			
			System.out.println("The given number"+ input + "is Palindrome");
		}
		
		else {
			
			System.out.println("The given number"+ input+ "is not a Palindrome");
		}
	}

}
