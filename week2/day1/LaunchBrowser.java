package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
     	 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
     	 
         Thread.sleep(1000); 
   
        driver.findElement(By.id("password")).sendKeys("crmsfa");
       
       Thread.sleep(1000);
        
        driver.findElement(By.className("decorativeSubmit")).click();
    
        Thread.sleep(1000);
        
        driver.close();

	}

}
