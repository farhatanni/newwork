package util;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public static WebDriver driver;
	
	
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://techfios.com/billing/?ng=login/");
		driver.get("https://techfios.com/test/101/index.php");
		return driver;
	}
	
	public static String fileRead() throws IOException{
		
	
			//File file = new File(".//input.txt");
			//FileReader fr = new FileReader(file);
			//BufferedReader br = new BufferedReader(fr);
			//String content ="";
		Scanner sc = new Scanner(new File(".//input.txt"));
			while (sc.hasNextLine()) {
				
				String content = sc.nextLine();
				return content;

			}
			return null;
			
	
		
		

	}
	

}
