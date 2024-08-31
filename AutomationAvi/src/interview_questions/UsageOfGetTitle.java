package interview_questions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	System.out.println(js.executeScript("return document.title"));
	String url = (String) js.executeScript("return document.title");
	System.out.println(url);
		
}
}
