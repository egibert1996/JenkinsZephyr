package example.Zephyr;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavegacionGoogle extends TestCase {
	
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = " https://www.google.es/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		
		driver.get(baseUrl + "/?gws_rd=ssl");
	    driver.findElement(By.linkText("Imágenes")).click();
	    driver.findElement(By.id("lst-ib")).clear();
	    driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	    driver.findElement(By.id("_fZl")).click();
	    driver.findElement(By.id("hdtb-tls")).click();
	    driver.findElement(By.cssSelector("span.mn-dwn-arw")).click();
	    driver.findElement(By.linkText("Grande")).click();
	    driver.close();
	    System.out.println("El test JUnit funciona");
	}

}