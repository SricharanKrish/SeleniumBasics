package automationQAE.AutomationPractice;

import java.time.Duration;  

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsByName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().maximize();
		
		driver.get("https://www.cybermindworks.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div/div/button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("name")).sendKeys("Suriya Kumar");
		
		
		
		
		
		
	}

}
