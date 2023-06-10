package org.student;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public void Java() {
    System.out.println("Java Implemented from Language Interface");		
	}

	@Override
	public void ruby() {
		System.out.println("ruby Implemented from abstract Multiple language");		
	}

	public void Selenium() {
      System.out.println("Selenium Implemented from Testtool interface");		
	}
	public static void main(String[] args) {
		Automation oops=new Automation();
		oops.Java();
		oops.python();
		oops.ruby();
		oops.Selenium();

}
	
}	
