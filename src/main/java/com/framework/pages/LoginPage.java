package com.framework.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.framework.design.ProjectMethods;
public class LoginPage extends ProjectMethods
{
	public LoginPage()
	{System.out.println("Lord Balaji");
	PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.ID,using="username") WebElement eleUsername;
	public LoginPage enterUserName(String username)
	{
	clearAndType(eleUsername,username);
	return new LoginPage();
	}
	
	@FindBy(how=How.ID,using="password") WebElement elePassword;
	public LoginPage enterPassword(String password)
	{
	clearAndType(elePassword,password);
	return new LoginPage();
	}
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") WebElement eleClick;
	public HomePage clickLogin()
	{
	click(eleClick);
	return new HomePage();
	}
}