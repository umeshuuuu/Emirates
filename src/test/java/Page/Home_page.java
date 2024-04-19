package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Home_page {
	WebDriver driver;
	By learnmore=By.xpath("//body/main[@id='maincontent']/div[1]/div[1]/div[2]/div[1]/a[1]");
	By dairport=By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[1]/div/div[1]/div/div/div[1]/div/input");
	By dairport2=By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[1]/div/div[1]/div/div/div[2]/section[1]/ol/li/div/div/p[2]");

	By araiport=By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[1]/div/div[2]/div/div/div[1]/div/input");
	By araiport2=By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[1]/div/div[2]/div/div/div[2]/section/ol/li[1]/div/div/p[1]");

	By dt=By.xpath("//*[@id=\"search-flight-date-picker--depart\"]");
	By dt2=By.xpath("//*[@id=\"search-flight-control\"]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody/tr[4]/td[1]/button");
	
	By rt=By.xpath("//*[@id=\"search-flight-date-picker--return\"]");
	By rt2=By.xpath("//*[@id=\"search-flight-control\"]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody/tr[4]/td[5]/button");
	
	By serh=By.xpath("//*[@id=\"search-flight-control\"]/section/div[4]/div[2]/div[3]/form/button/span");
	
	
	public Home_page(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void flight() throws Exception//String Dairport,String Arairport) {
		// COMES to the homepage 
		{driver.findElement(learnmore).click();
        driver.navigate().back();
        driver.findElement(dairport).click();
        Thread.sleep(2000);
        driver.findElement(dairport2).click();
        driver.findElement(araiport).click();
        Thread.sleep(2000);
        driver.findElement(araiport2).click();
        driver.findElement(dt).click();
        Thread.sleep(2000);
        driver.findElement(dt2).click();
        driver.findElement(rt).click();
        Thread.sleep(2000);
        driver.findElement(rt2).click();
        driver.findElement(serh).click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.navigate().back();
        driver.navigate().back();



        

        
        
      
        
        

	}

}
