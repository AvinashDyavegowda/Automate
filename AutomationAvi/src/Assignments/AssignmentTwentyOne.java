package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTwentyOne {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://online.actitime.com/fireflink3/login.do");
		driver.findElement(By.id("username")).sendKeys("manikantha.a@fireflink.com");
		driver.findElement(By.name("pwd")).sendKeys("Password@123");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[@onclick='openHelpAndSupportMenu(event)']/div/div")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
		}
		driver.get("https://www.actitime.com/legal/service-agreement");
		List<WebElement> allLink = driver.findElements(By.tagName("h2"));
		ListIterator<WebElement> l1 = allLink.listIterator(allLink.size());
		int variable=0;
		while(l1.hasPrevious() && variable<allLink.size()-1) {
			System.out.println(l1.previous().getText());
			variable++;
		}
		
		driver.quit();
		
	}

}
