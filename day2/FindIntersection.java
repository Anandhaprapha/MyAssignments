package week1.day2;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int arr[]= {4,6,7,3,2,9};
		
		int arr1[]= {2,5,7,9,3,8};
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr1.length; j++) {
				
				if (arr[i]==arr1[j]) {
					
					System.out.println(arr[i]);
					
				}
				
			}
			
		}
	}

}
