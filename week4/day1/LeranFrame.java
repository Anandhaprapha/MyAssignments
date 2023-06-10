package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[@id='Click'])[1]")).click();
		String text = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		//nested frame
		driver.switchTo().frame("frame2");
		//Second click
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		//immediate parent 
		driver.switchTo().parentFrame();
		
		

		
		
	}

}