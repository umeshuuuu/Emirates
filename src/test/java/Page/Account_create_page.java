package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Account_create_page {
	WebDriver driver;
	By title=By.xpath("//input[@id='title']");
	By mr=By.xpath("//*[@id=\"title\"]/div/button[2]");
	By fname=By.xpath("//input[@id='firstname']");
	By lname=By.xpath("//input[@id='lastname']");
	By email=By.xpath("//input[@id='registration-email']");
	By pass=By.xpath("//input[@id='password']");
	By day=By.xpath("//input[@id='dateofbirth-day']");
	By month=By.xpath("//input[@id='dateofbirth-month']");
	By year=By.xpath("//input[@id='dateofbirth-year']");
	By lang=By.xpath("//input[@id='preferred-language']");
	By ph=By.xpath("//input[@id='mobile']");
	By esm=By.xpath("//input[@id='false0']");
	By pol1=By.xpath("//body/div[@id='_ek_app_root_']/main[@id='maincontent']/div[2]/div[1]/div[1]/fieldset[1]/div[1]/div[8]/div[1]/label[1]");
	By pol2=By.xpath("//body/div[@id='_ek_app_root_']/main[@id='maincontent']/div[2]/div[1]/div[1]/fieldset[1]/div[1]/div[8]/div[2]/label[1]");
    By cacc=By.xpath("//button[contains(text(),'Create an account')]");


	
	public Account_create_page(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void reg(String Fname,String Lname,String Email,String Pass, String Day,String Month,
			String Year, String Lang, String Ph) throws Exception {
		
		    WebElement titleInput = driver.findElement(By.id("title"));
		    titleInput.clear();
		    // Clear any existing value in the input field
		    titleInput.sendKeys("Mr"); // Enter the value "Mr" into the input field
	        driver.findElement(mr).click();
	        driver.findElement(fname).sendKeys(Fname);
	        driver.findElement(lname).sendKeys(Lname);
	        driver.findElement(email).sendKeys(Email);
	        driver.findElement(pass).sendKeys(Pass);
	        driver.findElement(day).sendKeys(Day);
	        driver.findElement(day).sendKeys(Keys.ENTER);
	        Thread.sleep(1000);
	        driver.findElement(month).sendKeys(Month);
	        driver.findElement(month).sendKeys(Keys.ENTER);
	        Thread.sleep(1000);
	        driver.findElement(year).sendKeys(Year);
	        driver.findElement(year).sendKeys(Keys.ENTER);
	        Thread.sleep(1000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500)");
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        driver.findElement(lang).sendKeys(Lang);
	        driver.findElement(lang).sendKeys(Keys.ENTER);
	        driver.findElement(ph).sendKeys(Ph);
	        driver.findElement(ph).sendKeys(Keys.ENTER);
	        driver.findElement(pol1).click();
	        driver.findElement(pol2).click();
	        driver.findElement(cacc).click();
	        driver.navigate().back();
	        driver.navigate().back();
	        
	        
	        
	}
	
	   
	

	

}
