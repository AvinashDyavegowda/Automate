package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLogin {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://online.actitime.com/fireflink2/login.do");
	driver.findElement(By.id("username")).sendKeys("poojagunashekar1999@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("Password@123"+Keys.ENTER);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.id("logoutLink")).click();
}
}
