package week1.day1;

public class Mobile {

  public void sendSMS() {
	// TODO Auto-generated method stub
     System.out.println("Send SMS");
}
  
  protected void allowVoicecall() {
	// TODO Auto-generated method stub
      System.out.println( "Allow Voice Call");
}
     
  private void takeVideo() {
	// TODO Auto-generated method stub
      System.out.println("Take Video");
}
  
  
  public static void main(String[] args) {
	Mobile obj = new Mobile();
	obj.sendSMS();
	obj.allowVoicecall();
	obj.takeVideo(); 
	
}
}
