package handling_dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectAndDeselect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("file:///D:/hotel.html");
        WebElement mtr = driver.findElement(By.id("mtr"));
        Select s = new Select(mtr);
        List<WebElement> allOpt = s.getOptions();
        System.out.println(allOpt.size());
        
        for (int i = 0; i < allOpt.size(); i++) {
            s.selectByIndex(i);
        }

        for (int i = allOpt.size() - 1; i >= 0; i--) {
            s.deselectByIndex(i);
        }

        for (WebElement ele : allOpt) {
            String text = ele.getText();
            s.selectByVisibleText(text);
        }

        for (WebElement ele : allOpt) {
            s.deselectByValue(ele.getAttribute("value"));
        }

        driver.quit(); 
}
}
	
