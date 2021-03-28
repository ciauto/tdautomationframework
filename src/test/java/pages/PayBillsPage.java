package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import base.BasePage;

public class PayBillsPage extends BasePage {
	
	
	public PayBillsPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(xpath="//a[contains(text(),'Add New Payee')]")
	public WebElement lnkAddPayee;
	
	@FindBy(xpath="//input[@id='np_new_payee_name']")
	public WebElement txtPayeeName;
	
	@FindBy(id="np_new_payee_address")
	public WebElement txtPayeeAddress;
	
	@FindBy(id="np_new_payee_account")
	public WebElement txtPayeeAccount;
	
	@FindBy(id="np_new_payee_details")
	public WebElement txtPayeeDetails;
	
	@FindBy(id="add_new_payee")
	public WebElement btnAddPayee;
	
	@FindBy(id="alert_container")
	public WebElement alertContainer;
	
	public void doClickAddPayee() {
		lnkAddPayee.click();
		
	}
	
	public void doAddPayee(String pname, String paddress, String paccount, String pdetails) {
		txtPayeeName.sendKeys(pname);
		txtPayeeAddress.sendKeys(paddress);
		txtPayeeAccount.sendKeys(paccount);
		txtPayeeDetails.sendKeys(pdetails);
		btnAddPayee.click();
		
	}
	

}
