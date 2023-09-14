package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}


@FindBy(xpath="//input[@placeholder='Username']") 
WebElement txtusername;

@FindBy(xpath="//input[@placeholder='Password']") 
WebElement txtPassword;

@FindBy(xpath="//button[normalize-space()='Login']") 
WebElement btnLogin;


	public void setPassword() {
		txtPassword.sendKeys("mow&cd-2752407");
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void setuser() {
		txtusername.sendKeys("mow&cd-2752407");
	}
	
@FindBy(xpath="//select[@name='SelectTheme']")
WebElement Theme;
@FindBy(xpath="//select[@name='SelectLevel']") 
WebElement Level;
@FindBy(xpath="//select[@name='awc_center']") 
WebElement AWC;
@FindBy(xpath="//select[@name='SelectActivity']")
WebElement Activity;
@FindBy(xpath="//input[@name='SelectDateFrom']") 
WebElement date1;
@FindBy(xpath="//input[@name='SelectDateTo']") 
WebElement date2;
@FindBy(xpath="//input[@name='CountAdultMale']") 
WebElement AdultMale;
@FindBy(xpath="//input[@name='CountAdultFemale']") 
WebElement AdultFemale;
@FindBy(xpath="//input[@name='CountChildMale']") 
WebElement ChildMale;
@FindBy(xpath="//input[@name='CountChildFemale']") 
WebElement ChildFemale;
@FindBy(xpath="//button[normalize-space()='Submit']")
WebElement btnsubmit;	

public void fillform() {
	
	Select select = new Select(Theme);

	
	List<WebElement> options = select.getOptions();
	
	Select selectlevel = new Select(Level);
	
	Select selectAWC = new Select(Level);
	
	Select selectActivity = new Select(Level);
	
	List<WebElement> options1 = select.getOptions();
	

	// Iterate over the options and select them
	for (WebElement option : options) {
	  option.click();
	  
	  selectlevel.selectByVisibleText("AWC");
	  
	  selectAWC.selectByVisibleText("Harangul Bk8 Awc");
	  
	  for (WebElement option1 : options) {
		  option.click();
		  
		  
		  
	  }
	}

}


	

}



