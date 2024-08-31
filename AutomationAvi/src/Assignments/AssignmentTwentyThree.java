package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssignmentTwentyThree {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://myntra.com");
		Actions a = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
		WebElement homeAndLiving = driver.findElement(By.xpath("//a[text()='Home & Living']"));
		WebElement beauty = driver.findElement(By.xpath("//a[text()='Beauty']"));
		WebElement studio = driver.findElement(By.xpath("//a[text()='Studio']"));
		a.moveToElement(men).pause(1000).perform();
		a.moveToElement(women).pause(1000).perform();
		a.moveToElement(kids).pause(1000).perform();
		a.moveToElement(homeAndLiving).pause(1000).perform();
		a.moveToElement(beauty).pause(1000).perform();
		a.moveToElement(studio).pause(1000).perform();
		driver.quit();
}
}