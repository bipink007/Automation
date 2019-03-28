package com.comcastnew.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.comcastnew.genericlib.BaseClass;

public class Createproject extends BaseClass {
	@FindBy(linkText="Purchase Order")
	private WebElement Purchase;
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement createpur;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logout;
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signout;
	@FindBy(name="subject")
	private WebElement subject;
	@FindBy(xpath="//*[@id=\"frmEditView\"]/div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/img")
	private WebElement vendorclk;
	@FindBy(xpath="//a[text()='babubhai']")
	private WebElement window;
	@FindBy(name="bill_street") private WebElement billinpt;
	@FindBy(name="ship_street") private WebElement shipinpt;
	@FindBy(xpath="//img[@title='Products']") private WebElement productwin;
	@FindBy(xpath="//a[.='charger']") private WebElement chargerclk;
	@FindBy(xpath="//input[@id='qty1']") private WebElement qunt;
	@FindBy(name="listPrice1") private WebElement price;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement saveclk;
	public void signoutnow() {
		logout.click();
	}
	
	public void PurchseOrder() {
			Purchase.click();
	
	 }
	public void Createpurchase() {
		createpur.click();
	}
	public void sign() {
		signout.click();
	}
	public void entersubject(String subname) {
		subject.sendKeys(subname);
	}
	public void clickvendor() {
		vendorclk.click();
	}
	public void  getWindow() {
		window.click();
	
	}
	public void billint(String address1) {
		billinpt.sendKeys(address1);
	}
	public void shipint(String address2) {
		shipinpt.sendKeys(address2);
	}public void product() {
		productwin.click();
	}public void charger() {
		chargerclk.click();
	}public  void quant(String size) {
		qunt.sendKeys(size);
	}
	public void price(String pr) {
		price.clear();
		price.sendKeys(pr);
		}
	public void save() {
	saveclk.click();	
	}}


