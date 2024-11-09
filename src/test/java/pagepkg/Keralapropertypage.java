package pagepkg;

import java.io.ObjectStreamException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Keralapropertypage {
	WebDriver driver;
	By estatelogin=By.xpath("/html/body/header/div[1]/div/a[1]");
	//By newuser=By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/a");
	//By name=By.xpath("//*[@id=\"utitle\"]");
	//By email=By.xpath("//*[@id=\"umail\"]");
	//By passwd=By.xpath("//*[@id=\"memberpass\"]");
	//By cnfrmpaswd=By.xpath("//*[@id=\"repass\"]");
	//By phn=By.xpath("//*[@id=\"umobile\"]");
	//By createac=By.xpath("//*[@id=\"sub_regbutton\"]");
	By usrname=By.xpath("//*[@id=\"ulogin\"]");
	By password=By.xpath("//*[@id=\"upass\"]");
	By login=By.xpath("//*[@id=\"sub_logbtn\"]");
	By hambergermenu=By.xpath("/html/body/header/div[2]/div/a[2]");
	By sale=By.xpath("//*[@id=\"navbar-main\"]/div/ul/li[1]/a/div/i/img");
	public Keralapropertypage (WebDriver driver)
	{
	this.driver=driver;	
	}
	public void setup()
	{
		driver.findElement(estatelogin).click();
	    //driver.findElement(newuser).click();
	}
	
      public void userlogin(String username,String pwd)
	{
		driver.findElement(usrname).sendKeys(username);
		driver.findElement(password).sendKeys(pwd);
	}
	public void login()
	{
		driver.findElement(login).click();
		//driver.findElement(dropdwn).click();
		
	}
	public void test1()
	{
		driver.findElement(hambergermenu).click();
		driver.findElement(sale).click();
	}
	public void dropdwn()
	{
		WebElement category=driver.findElement(By.xpath("//*[@id=\"navbar-main\"]/div/ul/li[1]/a/div/i/img"));
		Select categry= new Select(category);
		categry.deselectByValue("1");
	}
	}

	
