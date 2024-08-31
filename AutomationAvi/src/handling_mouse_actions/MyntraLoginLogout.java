package handling_mouse_actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLoginLogout {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("./data/Commondata1.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String url = pobj.getProperty("url");
		String un = pobj.getProperty("username");
		String pwd = pobj.getProperty("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.findElement(By.id("Layer_1")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@value=1]")).click();
	}
}