package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLeads {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		String property=System.getProperty("webdriver.chrome.driver");
		System.out.println(property);
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();	
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstwindowhandles = new ArrayList <String>(windowHandles);
		driver.switchTo().window(lstwindowhandles.get(1));		
		driver.findElement(By.className("x-form-item-label")).sendKeys("Babu");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.linkText("10346")).click();
		driver.findElement(By.linkText("Merge")).click();

	}

}
