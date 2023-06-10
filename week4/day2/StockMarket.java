package week4.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StockMarket {

	public static void main(String[] args) {
/*1. Launch the URL https://www.chittorgarh.com/
2. Click on stock market
3. Click on NSE bulk Deals
4. Get all the Security names
5. Ensure whether there are duplicate Security names
	 */
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement findElements = driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']"));
		Actions builder=new Actions(driver);
		builder.click(findElements).perform();
		WebElement FE1 = driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]"));
		builder.click(FE1).perform();
	WebElement FE2 = driver.findElement(By.xpath("(//div[@class='table-responsive']/table)[1]"));
    List<WebElement> FE3 = driver.findElements(By.xpath("(//div[@class='table-responsive']/table)[1]//tr"));
	System.out.println(FE3.size());
    for (int i = 1; i < FE3.size()-1; i++) {
    	String rownames = driver.findElement(By.xpath("(//div[@class='table-responsive']/table)[1]//tr["+i+"]//td[1]")).getText();
    	System.out.println(rownames);	
}

	}
}
   
	   
