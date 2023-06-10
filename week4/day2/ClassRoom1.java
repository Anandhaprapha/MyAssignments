package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoom1 {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://erail.in/");
        
        driver.findElement(By.id("txtStationFrom")).clear();
        
        WebElement From = driver.findElement(By.id("txtStationFrom"));
        System.out.println(From);
        From.sendKeys("MAS");
        	
        driver.findElement(By.id("txtStationTo")).clear();
        
        WebElement To = driver.findElement(By.id("txtStationTo"));
        System.out.println(To);
        To.sendKeys("MDU");
        
        driver.findElement(By.id("chkSelectDateOnly")).click();
       
       
        	
	}

}
