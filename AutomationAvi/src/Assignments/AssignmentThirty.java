package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AssignmentThirty {
	public static void main(String[] args) throws InterruptedException, IOException {
        FileInputStream fis = new FileInputStream("D:\\CommonData.Properties");
        Properties p=new Properties();
        p.load(fis);
        String url = p.getProperty("url");
        System.out.println(url);
        String username = p.getProperty("username");
        System.out.println(username);
        String password = p.getProperty("password");
        System.out.println(password);
        p.setProperty("browser","chrome");
        String browser = p.getProperty("browser");
        System.out.println(browser);
    }
}
