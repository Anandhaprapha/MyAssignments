package week4.day1;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/alert.xhtml");
        
        //Alert(Simple Dialog)
        driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
        Alert simple = driver.switchTo().alert();
        String text = simple.getText();
        System.out.println(text);
        simple.accept();
        String text2 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
        System.out.println(text2);
        
        //Alert(Confirmation Dialog)
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        Alert confirmation = driver.switchTo().alert();
        String text3 = simple.getText();
        System.out.println(text3);
        confirmation.accept();
        String text4 = driver.findElement(By.xpath("//span[@id='result']")).getText();
        System.out.println(text4);
        
        
        //Alert(Prompt Dialog)
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        Alert Prompt = driver.switchTo().alert();
        String text5 = Prompt.getText();
        System.out.println(text5);
        Prompt.sendKeys("Anandha prapha");
        Prompt.accept();
        String text6 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
        System.out.println(text6);
        
        //Sweet Alert
        driver.findElement(By.xpath("//span[text()='Delete']")).click();
        String text7 = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
        System.out.println(text7);
        driver.findElement(By.xpath("//span[text()='Yes']")).click();
         
		

}
}
