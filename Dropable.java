package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		String property=System.getProperty("webdriver.chrome.driver");
		System.out.println(property);
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();	
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("draggable"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag,drop).perform();
		System.out.println(driver.findElement(By.xpath("//div[@id='droppable']/p")).getText());



	}

}
