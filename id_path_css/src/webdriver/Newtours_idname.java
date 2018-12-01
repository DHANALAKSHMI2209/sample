package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_idname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("dhanalachu");
		driver.findElement(By.name("password")).sendKeys("lachu2209");
		driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("dhana");
	driver.findElement(By.name("lastName")).sendKeys("lakshmi");	
	driver.findElement(By.name("phone")).sendKeys("9876543210");
	driver.findElement(By.name("userName")).sendKeys("dhana@gmail.com");	
	driver.findElement(By.name("address1")).sendKeys("triplicane");
	driver.findElement(By.name("city")).sendKeys("chennai");	
	driver.findElement(By.name("state")).sendKeys("tn");	
	driver.findElement(By.name("email")).sendKeys("dhana@gmail.com");
	driver.findElement(By.name("password")).sendKeys("asdf");	
	driver.findElement(By.name("confirmPassword")).sendKeys("asdf");	
	
		
		

	}

}
