package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
	    //Declare the input
		int[] arrayValue= {10,40,25,15,33,56};
		Set<Integer> Input=new TreeSet<Integer>();
		//Add the value in Set using loop
		for(int i=0;i<arrayValue.length;i++)
		{
			Input.add(arrayValue[i]);
		}
		System.out.println(Input);
		Object[] array = Input.toArray();
		//Find Length of Array
		int i=array.length;
		//Find Second Largest Number 
		System.out.println("Second Largest Number in Array Element");
		System.out.print(array[i-2]);
	}
}
