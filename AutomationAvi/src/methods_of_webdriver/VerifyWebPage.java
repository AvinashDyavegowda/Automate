package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String actualUrl=driver.getCurrentUrl();
		String expectedTitle = "Facebook";
		String expectedUrl="www.facebook.com/";
		if(actualTitle.contains(expectedUrl)&&actualUrl.equalsIgnoreCase(expectedUrl)) {
		 System.out.println("Pass, both Title and Url are same");
			}
		else
			{System.out.println("Fail, both Title and Url are not same");}
		driver.quit();
		}

}
