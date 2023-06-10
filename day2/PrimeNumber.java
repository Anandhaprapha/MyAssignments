package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Prime Number");
		
		      int m = 0 , flag=0;
		      int n = 13;
		      m=n/2;
		      
		      for (int i = 0; i < args.length; i++) {
				
		    	  if(n%i==0)   {
		    		  
		    		  
		    		  System.out.println(n + " not a prime number");
		    		  
		    		  flag=1;
		    		  break;
		    		  
		    	  }
		    	  
		    	  if(flag == 0)   {
		    		  
		    		  System.out.println(n + " is a prime number");
		    	  }
			}
	}
}
