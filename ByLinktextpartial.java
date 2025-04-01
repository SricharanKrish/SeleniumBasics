package automationQAE.AutomationPractice;

import java.time.Duration;  

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinktextpartial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().maximize();
        
        driver.get("https://app.chime.aws/meetings");
        
        Thread.sleep(3000);
        
        boolean aws = driver.findElement(By.linkText("AWS Service Terms")).isDisplayed();
        
        System.out.println(aws);
		
		Thread.sleep(5000);
		
				
		driver.findElement(By.partialLinkText("AWS Priv")).click();

	}

}
