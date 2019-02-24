package com.framework.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class MyHomePage extends ProjectMethods
{
	public MyHomePage()
	{
		PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.ID,using="sectionHeaderTitle_myHome") WebElement pageHeader;
	public MyHomePage verifyPageTitle()
	{
	String pageTitle = pageHeader.getText();
	if(pageTitle.equalsIgnoreCase("My Home"))
	{
		System.out.println("Page title is correct");
	}
	else
	{
		System.out.println("Page title is not correct");
	}
	return new MyHomePage();
	}
}