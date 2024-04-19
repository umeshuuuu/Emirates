package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Account_create_page;
import Page.Emirates_login_page;
import Page.Home_page;

public class Home_test {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
}
@BeforeTest
public void url()
{
	driver.get("https://www.emirates.com/in/english/");
}
@Test
public void test() throws Exception
{
	
	Emirates_login_page ob=new Emirates_login_page(driver);
	ob.setvalues("umeshudayan1084@gmail.com", "umesh@123");
	ob.login();
	ob.create();
	
}
@Test
public void test2() throws Exception
{
	Account_create_page vs=new Account_create_page(driver);
	vs.reg("umesh","udayan","umeshudayan1084@gmail.com","Umesh@12345tt","1","","2001","English","9961765145");
}
	
@Test
public void test3() throws Exception
{
	Home_page kp=new Home_page(driver);
	kp.flight();//"Abidjan (ABJ)","Abuja (ABV)");
}
	
	
	
}
