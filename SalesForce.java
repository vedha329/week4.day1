package week4.day1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password$123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWindowHandles = new ArrayList<String>(windowHandles);
		String secondWindow = lstWindowHandles.get(1);
		driver.switchTo().window(secondWindow);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		System.out.println("The Title : "+ driver.getTitle());

		
		String secondWindow1 = lstWindowHandles.get(0);
		driver.switchTo().window(secondWindow1);
		System.out.println("The Title : "+ driver.getTitle());
		driver.close();



	}

}
