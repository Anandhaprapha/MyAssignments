package org.student;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("My id number is:" +id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.printf("My id and name is:" +id  +name);
	}
	
	public void getStudentInfo(String Email,double PhoneNumber) {
		System.out.printf("My Email id & Phone number is :"+Email +PhoneNumber);
	}

	public static void main(String[] args) {
		Students info=new Students();
		info.getStudentInfo(10);
		info.getStudentInfo(10,"Anandha prapha");
		info.getStudentInfo("praphaganesh@gmail.com", 9865302265d);
		
	}
}
