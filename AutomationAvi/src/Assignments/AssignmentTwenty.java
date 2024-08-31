package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentTwenty {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
	WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	WebElement drag2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	WebElement drag3 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	WebElement drag4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
	WebElement drop2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
	Actions a = new Actions(driver);
	a.dragAndDrop(drag1, drop1);
	a.dragAndDrop(drag3, drop1);
	a.clickAndHold(drag2).pause(2000).moveToElement(drop2).release().build().perform();
	a.clickAndHold(drag4).pause(2000).moveToElement(drop2).release().build().perform();
	driver.quit();

}
}
