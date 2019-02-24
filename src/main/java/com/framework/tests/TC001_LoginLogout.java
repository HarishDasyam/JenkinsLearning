package com.framework.tests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.framework.design.ProjectMethods;
import com.framework.pages.LoginPage;
public class TC001_LoginLogout extends ProjectMethods
{
	@BeforeTest
	public void testData()
	{
		testCaseName = "TC001_LoginLogout";
		testDescription = "Login Logout";
		testNodes = "ONN";
		author = "Harish Dasyam";
		category = "Smoke";
		dataSheetName = "TC001";
	}
	@Test(dataProvider="fetchData")
	public void login(String username, String password)
	{
	new LoginPage().enterUserName(username).enterPassword(password).clickLogin().clickLogout();
	}
}