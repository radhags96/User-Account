package UserAccount.NewAccount;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage extends baseClass {
 
 @FindBy(how = How.XPATH, using ="(//input[@id='username'])[1]") 
 WebElement usernameTextBox;
 
 @FindBy(how = How.ID, using ="email") 
  WebElement emailTextBox;

 @FindBy(how = How.XPATH, using ="//input[@id='password']") 
  WebElement passwordTextBox;
 
 @FindBy(how = How.XPATH, using ="(//button[@type='button'])[3]") 
 WebElement createBtn; 
 
 @FindBy(how= How.XPATH, using="//div[text()='Invalid Data']")
 WebElement invalidmsg;
 
 public void setuserName(String struserName) { 
	 usernameTextBox.sendKeys(struserName);
 } 
 
 public void setemailAdd(String stremailAdd) { 
	 emailTextBox.sendKeys(stremailAdd);
 } 
 
public void setPassword(String strPassword) { 
     passwordTextBox.sendKeys(strPassword);
 }
public void clickBtn() { 
	createBtn.click();
		} 
public void invalidData() { 
	invalidmsg.click();
	
	}

}
