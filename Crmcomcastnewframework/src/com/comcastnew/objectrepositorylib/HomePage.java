package com.comcastnew.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.comcastnew.genericlib.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Admin;
	@FindBy(xpath="//a[text()='More']")
	private WebElement Menu;
	
	public void Moreclick() {
		Menu.click();
		

	}}


