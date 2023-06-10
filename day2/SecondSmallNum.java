package week1.day2;
import java.util.Arrays;
public class SecondSmallNum {
	public static void main(String[] args) {
		
		int num[]= {23,45,67,32,89,22};
		int length=num.length;
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println(num[i]);
			
			System.out.println("Second smallest Number : "+num[length-5]);
		}
	}

}
