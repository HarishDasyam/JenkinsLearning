package com.framework.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.framework.design.ProjectMethods;
public class HomePage extends ProjectMethods
{
	public HomePage()
	{
		PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") WebElement eleLogout;
	public void clickLogout()
	{
	click(eleLogout);
	}
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="CRM") WebElement clickCRMSFA;
	public void clickLogiout()
	{
	click(clickCRMSFA);
	}}