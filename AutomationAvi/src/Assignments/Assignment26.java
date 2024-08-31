package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment26 {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.hdfcbank.com/");
	WebElement Login = driver.findElement(By.xpath("//button[text()=’Login’]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(Login).perform();
	driver.findElement(By.linkText("NetBanking")).click();
	switchToNewWindow();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	driver.findElement(By.partialLinkText("Know")).click();
	switchToNewWindow();
	List<WebElement> allLanguanges = driver.findElements(By.xpath("//p[contains(text(),’preferred language’)]/a"));
	for (WebElement ele : allLanguanges) {
	System.out.println(ele.getText());}
	
}

	private static void switchToNewWindow() {
		// TODO Auto-generated method stub
		
}
}
