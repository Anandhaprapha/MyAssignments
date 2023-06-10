package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String value="madam";
		String rev="";
		
		for (int i = value.length()-1; i>=0; i--) {
			rev += value.charAt(i);
		}
			if (value.equalsIgnoreCase(rev)) {
				System.out.println("The given string is Palindrome :" +rev);
			}
				else {
					System.out.println("It is not a palindrome");
			
				
			}
			
		}

	}


