package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCSSValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");Thread.sleep(2000);
		String color = driver.findElement(By.linkText("Forgotten password")).getCssValue("color");
		System.out.println(color);
		driver.quit();
}
}