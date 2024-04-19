package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Emirates_login_page {
	WebDriver driver;
	By Login=By.xpath("//span[contains(text(),'Log in')]");
	By email=By.xpath("//input[@id='sso-email']");
	By pass=By.xpath("//input[@id='sso-password']");
	By logbutn=By.xpath("//button[@id='login-button']");
	By create=By.xpath("//body/div[@id='__next']/main[@id='maincontent']/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/section[1]/a[1]");
	
		public Emirates_login_page(WebDriver driver)
		{
		this.driver=driver;	
	}
		public void setvalues(String Email,String password) throws Exception {
			Thread.sleep(8000);
			driver.findElement(Login).click();
			Thread.sleep(3000);
			driver.findElement(email).sendKeys(Email);
			driver.findElement(pass).sendKeys(password);
			
		}
		public void login()
		{
			driver.findElement(logbutn).click();
			//driver.navigate().back();	
			
		}
		public void create() throws Exception
		{
			Thread.sleep(2000);
			driver.findElement(create).click();
		}

}
