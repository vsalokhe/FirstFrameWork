package com.myecom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myecom.base.BaseClass;

public class IndexPagePom extends BaseClass
{
	public IndexPagePom()
	{
		PageFactory.initElements(driver, this);
	}

{
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement logo;
	
	@FindBy(xpath="//a[@class='login']")
	WebElement siginButton;
	
	@FindBy(id="search_query_top")
	WebElement searchProduct;
	
}
}
