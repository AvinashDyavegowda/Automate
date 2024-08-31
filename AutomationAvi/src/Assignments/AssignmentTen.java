package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTen {
	public static void main(String[] args) {
		//Alphabetical and not all duplicates
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///D:/hotel.html");
		WebElement mtr =driver.findElement(By.id("mtr"));
		Set<String> set = new TreeSet<>();
		Select s1= new Select(mtr);
		List<WebElement> opt1 = s1.getOptions();
		for (WebElement ele1 : opt1) {
		String text =ele1.getText();
		set.add(text);
		}
		System.out.println(set);

	}
}
