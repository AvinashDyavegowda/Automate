package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.tagName("textarea")).sendKeys("Qspiders"+Keys.ENTER);Thread.sleep(2000);
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int count = allLinks.size();
	System.out.println(count);
	for(WebElement ele:allLinks) {
	 String text=ele.getText();
	 System.out.println(text);
	}
	
}
}
