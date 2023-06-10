package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassRoom1 {

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
			
            WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
            
            Select source =new Select(drop1);
            
            source .selectByIndex(4);
            
            WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId")); 
            
            Select find = new Select(drop2);
			
            find.selectByValue("CATRQ_AUTOMOBILE");
            
            WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId")); 
            
            Select search = new Select(drop3);
			
            search.selectByVisibleText("Public Corporation");
            
            driver.findElement(By.name("submitButton")).click();
            
            String currentTitle = driver.getTitle(); 
			
   		    System.out.println(currentTitle);
            
	        
	}

}
