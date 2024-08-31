package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentTwentySix {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hdfcbank.com/");
		WebElement Login = driver.findElement(By.xpath("//button[text()=’Login’]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(Login).perform();
		driver.findElement(By.linkText("NetBanking")).click();
		Set<String> allWid;
		allWid= driver.getWindowHandles();
		
		for (String wid:allWid) {
		driver.switchTo().window(wid);}
		driver.switchTo().frame(0);
		driver.findElement(By.partialLinkText("Know")).click();
		allWid= driver.getWindowHandles();
		
		for (String wid:allWid) {
		driver.switchTo().window(wid);}
		
		List<WebElement> allLang = driver.findElements(By.xpath("//p[contains(text(),’preferredlanguage’)]/a"));
		for (WebElement ele: allLang) {
		System.out.println(ele.getText());
		
}
}
}