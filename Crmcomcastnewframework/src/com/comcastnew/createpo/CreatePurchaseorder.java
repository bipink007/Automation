package com.comcastnew.createpo;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.comcastnew.genericlib.BaseClass;
import com.comcastnew.genericlib.Commonutils;
import com.comcastnew.objectrepositorylib.Createproject;
import com.comcastnew.objectrepositorylib.HomePage;

public class CreatePurchaseorder extends BaseClass {
	public static String parentWindowID;
	public static String childWindowID;
	Commonutils com=new Commonutils();
	@Test
	
	public void creatPurchaseorder() throws EncryptedDocumentException, IOException, InterruptedException  {	
		String subname=Flib.getExcelData("sheet1", 0, 0);
		String address1=Flib.getExcelData("sheet1", 1, 0);
		String address2=Flib.getExcelData("sheet1", 0, 1);
		String size=Flib.getExcelData("sheet1", 1, 1);
		String pr=Flib.getExcelData("Sheet1", 2, 0);
		HomePage clk=PageFactory.initElements(driver, HomePage.class);
		clk.Moreclick();
	    Createproject pro=PageFactory.initElements(driver, Createproject.class);
		pro.PurchseOrder();
		pro.Createpurchase();
		pro.entersubject(subname);
		pro.clickvendor();
	    com.getWindowIDS();
	    pro.getWindow();
	   com.getWindowID();
	  pro.billint(address1);
	  pro.shipint(address2);
	  pro.product();
	  com.getWindowIDS();
	  pro.charger();
	  com.getWindowID();
	  pro.quant(size);
	  pro.price(pr);
	  pro.save();
		        
				
				
				
		
	}
}