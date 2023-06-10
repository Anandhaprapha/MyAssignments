package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count {

	public static void main(String[] args) {
/*
 * 1. Launch the URL https://html.com/tags/table/
2. Get the count of number of rows
3. Get the count of number of columns

 */
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement findElement = driver.findElement(By.xpath("//div[@class='related-pages']/table"));
		List<WebElement> rowcount = driver.findElements(By.xpath("//div[@class='related-pages']/table//tr"));
	    System.out.println(rowcount.size());	
	    List<WebElement> columncount= driver.findElements(By.xpath("//div[@class='related-pages']/table//tr//td"));
	    System.out.println(columncount.size());
	    
	
	
	}

}
