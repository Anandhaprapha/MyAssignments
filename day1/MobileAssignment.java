package week1.day1;

public class MobileAssignment {

	public void makeCall() {
		
         String mobileModel = "Samsung";
        		 
         float mobileWeight = 50.5f;
         
         System.out.println(mobileModel);
         
         System.out.println(mobileWeight);
	}
	
         public void sendMsg() {
			
         boolean isFullCharged = true;
         
         int mobileCost = 15000; 
         
         System.out.println(isFullCharged);
         
         System.out.println(mobileCost);
		}
		
         public static void main(String[] args) {
			
        	 MobileAssignment obj = new MobileAssignment();
        	 obj.makeCall();
        	 obj.sendMsg();
        	 
        	 System.out.println("This is my mobile");
		}
}
