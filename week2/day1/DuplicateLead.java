package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
	
        ChromeDriver driver = new ChromeDriver();
		
        driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
     	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
   
        driver.findElement(By.id("password")).sendKeys("crmsfa");
   
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.partialLinkText("CRM")).click();
    	
		driver.findElement(By.linkText("Leads")).click();
	
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prapha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ganesh");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prapha");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("LearningAutomation");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("praphaganesh@gmail.com");
		
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 String title = driver.getTitle(); 
			
		 System.out.println(title);
		 
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).clear();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leafground");
		 
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
			
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indhu");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 String title1 = driver.getTitle(); 
			
		 System.out.println(title1);
		 
	}

}
