package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleFrames {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///D:/T1.html");
	driver.findElement(By.id("t1")).sendKeys("A");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("B");
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("C");
	driver.switchTo().frame("f1");
	driver.findElement(By.id("t2")).sendKeys("D");
}
}
