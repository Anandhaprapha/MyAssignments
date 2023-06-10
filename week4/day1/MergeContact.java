package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        //1. Launch URL "http://leaftaps.com/opentaps/control/login"  
        driver.get("http://leaftaps.com/opentaps/control/login");  
        
        // 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//5. Click on contacts Button
		driver.findElement(By.partialLinkText("Contacts")).click();
		
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//7. Click on Widget of From Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> source=new ArrayList<String>(windowHandles);
		driver.switchTo().window(source.get(1));
		
		//8. Click on First Resulting Contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(source.get(0));
		
		//9. Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> source1=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(source1.get(1));
		
		//10. Click on Second Resulting Contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		driver.switchTo().window(source1.get(0));
		
		//11. Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert dialogbox = driver.switchTo().alert();
		
		//12. Accept the Alert
		dialogbox.accept();
		
		//13. Verify the title of the page
		System.out.println(driver.getTitle());
		
	}
}
