package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://www.newtours.demoaut.com/");
driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("dhana");
driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("lakshmi");
driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("0987654321");
driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("dhna");
driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("triplicane");
driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
driver.findElement(By.xpath("//input[@name='state']")).sendKeys("tn");
driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("56687");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dhana");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ghdd");
driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("jhbfsd");



	}

}
