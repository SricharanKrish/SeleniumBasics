package AutomationQAE.AutomationPractice;


import java.time.Duration;  

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class locatorsIdXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//PATH OF CHROMEDRIVER IN LOCAL
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		
		// INITIALIZE NEW CHROMEDRIVER
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().maximize();
		
		
		// TELLS CHROMEDRIVER WHICH WEBSITE TO GO TO
		driver.get("https://www.yegneshwaranhariharan.com/");
		
		// TELLS WEBDRIVER TO WAIT BEFORE DOING SOMETHING
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		//ASKS WEB DRIVER TO CHECK WHETHER SOMETHING IS DISPLAYED USING By.ID
		boolean display = driver.findElement(By.id("img_comp-kpebmzm1")).isDisplayed();
		System.out.println(display); // IF DISPLAYED, PRINT TRUE
		
		
		Thread.sleep(4000);
		
		// CLICK AN ELEMENT AFTER IDENTIFYING IT USING XPATH
		driver.findElement(By.xpath("//*[@id=\"comp-ivgjuufw2label\"]")).click();
		
		
		
	}

}
