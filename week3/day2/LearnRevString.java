package week3.day2;

public class LearnRevString {

	public static void main(String[] args) {
	
		String input="Amazon development centre, Chennai";
		String lower=input.toLowerCase();
		String[] split = lower.split(" ");
		
		for (int i = split.length-1; i>=0; i--) {
			System.out.println("" + split[i]);
		}
	}

}
