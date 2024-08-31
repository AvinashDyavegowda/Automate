package handling_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///D:/hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s = new Select(mtr);Thread.sleep(2000);
	s.selectByIndex(0);Thread.sleep(2000);
	s.selectByValue("2");Thread.sleep(2000);
	s.selectByVisibleText("Dosa");Thread.sleep(2000);
	s.deselectByIndex(2);
	s.deselectByVisibleText("Bisibelebath");
	s.deselectByValue("1");
	s.deselectAll();
	driver.quit();
	
}
}
