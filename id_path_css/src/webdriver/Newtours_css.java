package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://www.newtours.demoaut.com/");
driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("dhana");
driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("lakshmi");
driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("976878785949");
driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("dhsdfhj");
driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("triplicane");
driver.findElement(By.cssSelector("input[name='city']")).sendKeys("chennai");
driver.findElement(By.cssSelector("input[name='state']")).sendKeys("tn");
driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("65879987654");
driver.findElement(By.cssSelector("input[name='email']")).sendKeys("kjhzjxhkh");
driver.findElement(By.cssSelector("input[name='password']")).sendKeys("asdfghjkl");
driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("hgfdsghjk");
	}
	

}
