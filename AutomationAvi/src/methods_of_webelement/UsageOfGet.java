package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("login"));
		String tagname = ele.getTagName();
		String text = ele.getText();
		String value = ele.getAttribute("type");
		System.out.println("The tagname of element:" +tagname );
		System.out.println("The tagtext of element:" +text);
		System.out.println("The attribute value of element:" +value);
		driver.quit();
}
}