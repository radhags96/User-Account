package UserAccount.NewAccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class baseClass {
		
		WebDriver driver = new ChromeDriver();	
		
		@BeforeTest	
		public void launchBrowser() {
			driver.manage().window().maximize(); 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			driver.get("https://try.vikunja.io/register");
		}
		
		@Test
		
		public void testcase1() throws Exception { 
			  
	        loginPage lp =  PageFactory.initElements(driver, loginPage.class); 
	       
	        lp.setuserName("ra");
	        lp.setemailAdd("r@gmail.com");
	        lp.setPassword("Radha@12345");
	        lp.clickBtn();		        
	
	        String originalTitle = driver.getTitle();     
	        String expectedTitle = "Create account | Vikunja";	              
	         
             if (originalTitle==expectedTitle) { 
           System.out.println("Account created successfully " + originalTitle);
			}else {
		System.out.println("Cannot create an account " + lp.invalidmsg.getText());			
		Reporter.log("Cannot create an account " + lp.invalidmsg.getText());
			}  
	}
		
		 @AfterTest
		    public void closeBrowser() { 
		        driver.quit(); 
		    }
	}