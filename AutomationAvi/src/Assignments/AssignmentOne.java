package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentOne {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(555,333));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();Thread.sleep(2000);
		driver.navigate().forward();Thread.sleep(2000);
		driver.navigate().refresh();Thread.sleep(2000);
		String t =driver.getTitle();
		String au = ("https://www.instagram.com");
		String at =("Instagram");
		System.out.println(t);
		String u =driver.getCurrentUrl();
		System.out.println(u);
		
		Thread.sleep(2000);
		if(au==u&&at==t)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().minimize();
		driver.quit();
	}
}


