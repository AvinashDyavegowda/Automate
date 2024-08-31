package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementsUsingJSE {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bbc.com/");
WebElement music = driver.findElement(By.xpath("//h2[text()='Music']"));
int yaxis = music.getLocation().getY();
Actions a = new Actions(driver);
a.scrollToElement(music).perform();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollTo(0,"+yaxis+")");


}
}
