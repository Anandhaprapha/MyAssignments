package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookXPath {

	public static void main(String[] args) throws InterruptedException 
	
	{

		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/.");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Prapha");
		
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Ganesh");
		
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("9865302265");
		
		driver.findElement(By.xpath("//input[@name ='reg_passwd__']")).sendKeys("Facebook@10");
		
	    WebElement day1 = driver.findElement(By.id("day"));
	    
        Select day =new Select((WebElement) day1);
        
        day.selectByIndex(9);
        
        WebElement month1 = driver.findElement(By.id("month"));
        
        Select month =new Select((WebElement) month1);
        
        month.selectByVisibleText("Jul");
        
        WebElement years = driver.findElement(By.id("year"));
        
        Select year =new Select((WebElement) years);
        
        year.selectByValue("1995");
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//label[@class = '_58mt']")).click();
        
        
        
        
        
        
		
	     
		
		
		

	}

}

