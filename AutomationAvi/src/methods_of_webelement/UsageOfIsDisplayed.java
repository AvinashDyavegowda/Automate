package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");Thread.sleep(2000);
		//isDisplayed() is used to check whether the element is displayed or not
		boolean res = driver.findElement(By.linkText("Create a Page")).isDisplayed();
		if(res) {System.out.println("The element is displayed");}
		else { System.out.println("The element is not displayed");

}
}
}
