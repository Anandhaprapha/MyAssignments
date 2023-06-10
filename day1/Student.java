package week1.day1;

public class Student {
	
	    String studentName = "Prapha";
	    int rollNo = 150;
	    String collegeName = "SSS Engineering College";
	    int markScored = 90;
	    float cgpa = 8.5f;
	    
	    public void report() {
	    	
	    	System.out.println("StudentName:"+studentName);
	    	System.out.println("RollNo:"+rollNo);
	    	System.out.println("CollegeName:"+collegeName);
	    	System.out.println("MarkScored:"+markScored);
	    	System.out.println("CGPA:"+cgpa);
	    
	    }
	    
	    public static void main(String[] args) {
		
	    	
	    	   Student obj = new Student();
	    	   obj.report();
		}
}  
