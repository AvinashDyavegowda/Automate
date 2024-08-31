package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceAssinment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("0987654321");
	driver.findElement(By.id("dob")).click();
	WebElement ele1=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s1=new Select(ele1);
	s1.selectByIndex(7);
	WebElement ele2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s2=new Select(ele2);
	s2.selectByValue("1986");
	driver.findElement(By.linkText("3")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("7019341117");Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();Thread.sleep(2000);
	boolean res = driver.findElement(By.xpath("//span[contains(@id,'policynumberError')]")).isDisplayed();
	System.out.println(res);
	if(res)  
	{
		System.out.println("policy error message is displayed");
	}
	else	
	{
		System.out.println("policy error message is not displayed");
	}
	driver.quit();
}
}
