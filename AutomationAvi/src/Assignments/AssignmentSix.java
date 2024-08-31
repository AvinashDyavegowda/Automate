package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentSix {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get("https://online.actitime.com/fireflink4/login.do");
		d.findElement(By.id("username")).sendKeys("Enter email");
		d.findElement(By.name("pwd")).sendKeys("Enter password"+Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.urlToBe("https://online.actitime.com/fireflink4/timetrack/enter.do"));
		System.out.println(d.getCurrentUrl());
		d.quit();

	}

}
