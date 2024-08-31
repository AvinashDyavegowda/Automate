package interview_questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextBoxValue {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement ele = driver.findElement(By.name("q"));
	ele.sendKeys("Olympics");
	String text = ele.getAttribute("value");Thread.sleep(2000);
	System.out.println(text);
	driver.quit();
}
}
