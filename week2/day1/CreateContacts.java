package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
		
        driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
     	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
   
        driver.findElement(By.id("password")).sendKeys("crmsfa");
   
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.partialLinkText("CRM")).click();

        driver.findElement(By.linkText("Contacts")).click();
        
        driver.findElement(By.partialLinkText("Create")).click();
        
        driver.findElement(By.id("firstNameField")).sendKeys("Prapha");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Ganesh");
		
		 driver.findElement(By.name("submitButton")).click();
		 
		 String firstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		 
		 System.out.println(firstName);
		 
		 String currentTitle = driver.getTitle(); 
			
		 System.out.println(currentTitle);
		 
	     driver.close();
		

	}

}
