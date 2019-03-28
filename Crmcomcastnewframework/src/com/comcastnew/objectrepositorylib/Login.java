package com.comcastnew.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy (name="user_name")
	private WebElement usernameEdt;
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	@FindBy(id="submitButton")
	private WebElement loginbuttonEdt;
	
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPassswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginbuttonEdt() {
		return loginbuttonEdt;
	}

	public void loginToApp(String username,String password) {
      usernameEdt.sendKeys(username);
      passwordEdt.sendKeys(password);
      loginbuttonEdt.click();
	
}}
