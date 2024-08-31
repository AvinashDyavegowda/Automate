package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
}
}
