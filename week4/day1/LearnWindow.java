package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/window.xhtml");
        
        //click and confirm new window opens 
        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> source=new ArrayList<String>(windowHandles);
        driver.switchTo().window(source.get(1));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(source.get(0));
        System.out.println(driver.getTitle());
        
        //Find the number of opened tabs
        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
        Set<String> windowHandles2 = driver.getWindowHandles();
        List<String> source1=new ArrayList<String>(windowHandles2);
        for (int i = 0; i < source1.size(); i++) {
        	System.out.println(source1.get(i));
		}
        driver.switchTo().window(source1.get(2));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(source1.get(1));
        System.out.println(driver.getTitle());
        driver.close();
        
        //close all window except primary
        driver.switchTo().window(source1.get(0));
        driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
        Set<String> windowHandles3 = driver.getWindowHandles();
        List<String> source3=new ArrayList<String>(windowHandles3);
        driver.switchTo().window(source3.get(3));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(source3.get(2));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(source3.get(1));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(source3.get(0));
        System.out.println(driver.getTitle());
        
        //Wait for 2 tabs to open
        driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
        Set<String> windowHandles4 = driver.getWindowHandles();
        List<String> source4=new ArrayList<String>(windowHandles4);
        driver.switchTo().window(source4.get(2));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(source4.get(1));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(source4.get(0));
        System.out.println(driver.getTitle());
        driver.quit();
        
       
        

	}

}
