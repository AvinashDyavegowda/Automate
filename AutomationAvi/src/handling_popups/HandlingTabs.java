package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max"+Keys.ENTER);
		driver.findElement(By.partialLinkText("Apple iPhone 15 Pro Max")).click();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid: allWid) {
		driver.switchTo().window(wid);Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
}
}
}