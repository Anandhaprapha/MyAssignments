package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaa {

	public static void main(String[] args) {
	

        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@class='css-1upamjb'] ")).sendKeys("Face Masks");
		
				
	}

}
