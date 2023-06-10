package week7.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitLeafGround {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		
		//Wait for Visibility (1 - 10 Sec)
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("snap/beforeVisible.png");
		FileUtils.copyFile(source,destination);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println("Wait for Visibility (1 - 10 Sec) :" +text);
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("snap/afterVisible.png");
		FileUtils.copyFile(source1,destination1);
	
	
		//Wait for Invisibility (1 - 10 Sec)
		File source2 = driver.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("snap/beforeHide.png");
		FileUtils.copyFile(source2,destination2);
		String text1 = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
		System.out.println("Before the click :" +text1);
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		WebElement waitforInVisibilty = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		wait.until(ExpectedConditions.invisibilityOf(waitforInVisibilty));
		File source3 = driver.getScreenshotAs(OutputType.FILE);
		File destination3 = new File("snap/beforeHide.png");
		FileUtils.copyFile(source3,destination3);
		
		
		//Wait for Clickability
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		File source4 = driver.getScreenshotAs(OutputType.FILE);
		File destination4 = new File("snap/firstClick.png");
		FileUtils.copyFile(source4,destination4);
		WebElement clickability = driver.findElement(By.xpath("//span[text()='Click Second']"));
		wait.until(ExpectedConditions.elementToBeClickable(clickability));
		driver.executeScript("arguments[0].click();",clickability);
		File source5 = driver.getScreenshotAs(OutputType.FILE);
		File destination5 = new File("snap/firstClick.png");
		FileUtils.copyFile(source5,destination5);
		
		//Wait for Text Change (1 - 10 Sec)
		String text2 = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
		System.out.println("Before text change :" +text2);
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//span[text()='I am going to change!']"),text2));
		String text3 = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		System.out.println("After text change :" +text3);
		if(text2 != text3 ) {
			System.out.println("Text has changed");
		}
		else {
			System.out.println("Text not Changed");
		}
		
		
		driver.close();	
	}
	

}