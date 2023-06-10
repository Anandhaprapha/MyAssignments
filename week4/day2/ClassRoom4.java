package week4.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassRoom4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ChromeDriver driver=new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://jqueryui.com/selectable/");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		        //handle the frame
		        driver.switchTo().frame(0);
		        WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		        WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		        WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		        WebElement item4= driver.findElement(By.xpath("//li[text()='Item 4']"));
		       //individual click
		        Actions builder=new Actions(driver);
		        //builder.click(item2).click(item4).release().perform();
		        //keyActions
		        builder.keyDown(Keys.CONTROL).click(item4).click(item2).click(item1).keyUp(Keys.CONTROL).perform();
	}

}
