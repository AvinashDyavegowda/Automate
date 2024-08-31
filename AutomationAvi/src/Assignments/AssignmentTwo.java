package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTwo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys("ViratKohli"+Keys.CONTROL+"ac");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.name("pass"));
		ele2.sendKeys(Keys.CONTROL+"v");Thread.sleep(2000);
		ele.clear();
		ele2.clear();Thread.sleep(2000);
		Dimension d1 = ele.getSize();
		int h1 =d1.getHeight();
		int w1=d1.getWidth();
		Dimension d2 = ele2.getSize();
		int h2=d2.getHeight();
		int w2=d2.getWidth();
		System.out.println(h1);
		System.out.println(w1);
		System.out.println(h2);
		System.out.println(w1);
		if(d1==d2)
			{
			System.out.println("both height and width of email and pwd text box are same");
		}
		else 
		{
			System.out.println("both height and width of email and pwd text box are not same");
		}
		WebElement ele3 = driver.findElement(By.name("login"));
		String tagname = ele3.getTagName();
		String tagtext = ele3.getText();
		String attribute = ele3.getAttribute("value");
		String color = ele3.getCssValue("color");
		System.out.println("tagname="+tagname );
		System.out.println("tagtext="+tagtext);
		System.out.println("attributevalue="+attribute);
		System.out.println("color="+color);
		boolean s = ele3.isEnabled();
		if(s==true)
		{
			System.out.println("login button is enabled");
		}
		else 
		{
			System.out.println("login is not enabled");
				}
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		boolean t = driver.findElement(By.linkText("Sign Up")).isDisplayed();
		if(t==true)
		{
			System.out.println("signup is displayed");
		}
		else
		{
			System.out.println("sign is not displayed");
		}
		driver.quit();
		
	}
	}

