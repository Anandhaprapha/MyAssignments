package week4.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassRoom2 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.snapdeal.com/");
        WebElement MensFashion = driver.findElement(By.xpath("//span[@class='catText'][1]"));
       
        Actions act = new Actions (driver);
        act.moveToElement( MensFashion).perform();
        
    }

	}


