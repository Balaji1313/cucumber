package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement selecthotelmsg;

	@FindBy(xpath = "//label[text()='Please Select a Hotel']")
	private WebElement plsselecthotelmsg;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;

	@FindBy(id = "continue")
	private WebElement btncontinue;

	public WebElement getSelecthotelmsg() {
		return selecthotelmsg;
	}

	public WebElement getPlsselecthotelmsg() {
		return plsselecthotelmsg;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public void selectWithHotelName() {
		click(getRadiobtn());

		click(getBtncontinue());

	}

	public void selectWithoutHotelName() {

		click(getBtncontinue());

	}

}
