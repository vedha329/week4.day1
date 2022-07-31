package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TryIt {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		chrome.manage().window().maximize();
		
		WebElement parentframe = chrome.findElement(By.id("iframeResult"));
		chrome.switchTo().frame(parentframe );

		chrome.findElement(By.xpath("//buttom[text()='Try it']")).click();
		Alert a=chrome.switchTo().alert();

		a.dismiss();

		String result=chrome.findElement(By.xpath("//p[@id='demo']")).getText();

		System.out.println(result);

	

		

	}

}
