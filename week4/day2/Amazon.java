package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
/*
 * Amazon:
1.Load the uRL https://www.amazon.in/
2.search as oneplus 9 pro 
3.Get the price of the first product
4. Print the number of customer ratings for the first displayed product
5. Mouse Hover on the stars
6. Get the percentage of ratings for the 5 star.
7. Click the first text link of the first image
8. Take a screen shot of the product displayed
9. Click 'Add to Cart' button
10. Get the cart subtotal and verify if it is correct.
 */
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.getWindowHandle();
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(text);
	   driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstwindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindow.get(1));
	     System.out.println(driver.getTitle());
	     String text2 = driver.findElement(By.xpath("(//span[text()='6 ratings'])[1]")).getText();
	     System.out.println(text2);
	     Actions Builder=new Actions(driver);
	     WebElement findElement = driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]"));
	     Builder.click(findElement).perform();
	     Thread.sleep(2000);
	     String text3 = driver.findElement(By.xpath("(//a[@class='a-size-base a-link-normal'])[4]")).getText();
	     System.out.println(text3);
	     WebElement findElement2 = driver.findElement(By.xpath("//img[@id='landingImage']"));
	     Builder.doubleClick(findElement2).perform();
	     driver.switchTo().frame(0);
	     File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	     File dest=new File("./snapshot/Onepluspro.png");
	     FileUtils.copyFile(screenshotAs, dest); 
	     driver.switchTo().defaultContent();
	     driver.findElement(By.xpath(" //button[@class=' a-button-close a-declarative a-button-top-right']")).click();
	     driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	     String text4 = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
	     if (text.equals(text4)) {
			System.out.println("Price are same");
		}
	     else {
			System.out.println("Price are different");
		}
	      // In these final checking instance text value is integer and text4 value is float so it showing the result "Price are different"
	}

}
