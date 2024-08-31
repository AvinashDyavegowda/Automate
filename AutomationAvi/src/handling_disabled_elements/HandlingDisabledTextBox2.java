package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledTextBox2 {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Disabled.html");
		WebElement t1 = driver.findElement(By.id("t1"));
		WebElement t2 = driver.findElement(By.id("t2"));
		boolean res = t1.isEnabled();
		boolean res2 = t2.isEnabled();
		System.out.println(res);
		System.out.println(res2);
		t1.sendKeys("virat");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('t2').value='Sachin'");Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value=''");Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').click()");Thread.sleep(2000);
}
}