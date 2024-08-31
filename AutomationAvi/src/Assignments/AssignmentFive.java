package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFive {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		List<WebElement> allPhone = driver.findElements(By.xpath("//div[contains(text(), 'Apple iPhone 14 Pro Max')]"));
		int count = allPhone.size();
		System.out.println(count);
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[contains(text(), 'Apple iPhone')]/../..//div//div[1]/div[1]/div[1]"));
		for(int i=0;i<count;i++)
		{
			String ele = allPhone.get(i).getText();
			String ele1 = allPrice.get(i).getText();
			System.out.println(ele + ele1);
		}
		driver.quit();
	}

}
