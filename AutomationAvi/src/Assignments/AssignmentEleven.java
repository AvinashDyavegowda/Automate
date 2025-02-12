package Assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentEleven {
	// only duplicates
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("file:///D:/hotel.html");
	WebElement mtr =driver.findElement(By.id("mtr"));
	Thread.sleep(3000);
	Set<String> set = new HashSet<>();
	Select s1= new Select(mtr);
	List<WebElement> opt1 = s1.getOptions();
	for (WebElement ele1 : opt1) {
	String text =ele1.getText();
	if (set.contains(text)) {
	//if already set has the text you print it if not go to else
	System.out.println(text);
	}else {
	set.add(text);
	}
	}
	driver.quit();
	}
}
