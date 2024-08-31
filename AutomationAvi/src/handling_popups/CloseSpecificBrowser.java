package handling_popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the partial title");
		String expectedTitle = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait (Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allWid= driver.getWindowHandles();
		// for (String wid: allWid) {
		// d.switchTo().window(wid); // String actualTitle= d.getTitle();
		// if(lactualTitle.contains(expectedTitle)) { d.close();}
		Iterator<String> i = allWid.iterator();
		while(i.hasNext()) {
		String wid=i.next();
		driver.switchTo().window(wid);
		String actualTitle= driver.getTitle();
		if(actualTitle.contains(expectedTitle))
			driver.close();
}
}
}
