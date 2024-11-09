package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Keralapropertypage;
import pagepkg.Keralapropertypage;
//import pagepkg.Realesttatepg;

public class Keralapropertytest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();	
	driver.get("https://keralaproperty.in/");
	}
	@Test
	public void test()
	{
		Keralapropertypage ob=new Keralapropertypage(driver);
		ob.setup();
		//ob.setvalues("Ajith", "Ajithraji9@gmail.com", "Shilpajith@forever1", "Shilpajith@forever1","9947359049");
		//ob.click();
		ob.userlogin("Ajithraji9@gmail.com","Shilpajith@forever1");
		ob.login();
		ob.test1();
		ob.dropdwn();
		//driver.navigate().back();
	}

	}


