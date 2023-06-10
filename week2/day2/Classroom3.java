package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom3 {

	public static void main(String[] args) throws InterruptedException {
	
		
         ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name = 'USERNAME']")).sendKeys("demosalesmanager");
		
		driver.findElement(By.xpath("//input[@name = 'PASSWORD']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		
		

	}

}
