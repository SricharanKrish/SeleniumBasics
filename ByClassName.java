package automationQAE.AutomationPractice;


import java.time.Duration;  

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ByClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().maximize();
        
        driver.get("https://app.chime.aws/meetings");
        
        Thread.sleep(3000);
        
        driver.findElement(By.className("Input")).sendKeys("2456674");
        
        Thread.sleep(4000);
        
        driver.findElement(By.className("Button")).click();
        
		
		

	}

}
