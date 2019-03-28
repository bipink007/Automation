package com.comcastnew.genericlib;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Commonutils  extends BaseClass{
	public static String parentWindowID;
	public static String childWindowID;
	public void waitandclickElement(WebElement element) throws InterruptedException {
	int count=0;
	while(count<20) {
		try {
			element.click();
			break;
		}catch(Exception e) {
			Thread.sleep(1000);
			count++;
			
		}
	}
	}
	public void select(WebElement element,String option) {
		Select sel=new Select(element);
		sel.selectByVisibleText(option);
		
	}
	public void moveMouse(WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void getWindowIDS() throws InterruptedException {
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		parentWindowID= it.next();
		childWindowID= it.next();
	driver.switchTo().window(childWindowID);
	
		}
	public void getWindowID() throws InterruptedException {
	
driver.switchTo().window(parentWindowID);
}}