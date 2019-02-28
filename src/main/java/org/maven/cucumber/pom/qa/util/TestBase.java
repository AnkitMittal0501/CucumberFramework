package org.maven.cucumber.pom.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prp;

	public TestBase() {
		prp = new Properties();
		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\My Pc\\eclipse-workspace\\org.maven.cucumber.pom\\src\\" + "main\\java\\org\\maven"
							+ "\\cucumber\\pom\\qa\\config\\config.properties");
			prp.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

	public static void initialize() {
		String browserName = prp.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,
		 * TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT,
		 * TimeUnit.SECONDS);
		 */driver.get(prp.getProperty("url"));
		
	}
}
