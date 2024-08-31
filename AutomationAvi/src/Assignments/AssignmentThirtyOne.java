package Assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThirtyOne {
	static Workbook wb;
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        FileInputStream fis = new FileInputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\Actitime_signin_Testcase.xlsx");
        wb = WorkbookFactory.create(fis);
        int rowCount = wb.getSheet("Actitime_Signin_TestCase").getLastRowNum();
        for (int i = 1; i <= rowCount; i++) {
            ArrayList<String> data = getData(i);
            String username = data.get(0);
            String password = data.get(1);
            driver.get("https://online.actitime.com/fireflink3/login.do");
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.name("pwd")).sendKeys(password);
            driver.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(2000);
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.contains("login")) {
                setData(i, false);
            } else {
                setData(i, true);
                driver.findElement(By.xpath("//div/a[text()='Logout']")).click();
            }
        }

        FileOutputStream fout = new FileOutputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\Actitime_signin_Testcase.xlsx");
        wb.write(fout);
        wb.close();

        driver.quit();
    }
	private static void setData(int i, boolean b) {
		// TODO Auto-generated method stub
		
	}
	private static ArrayList<String> getData(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
