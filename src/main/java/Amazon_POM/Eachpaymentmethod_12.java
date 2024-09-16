package Amazon_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eachpaymentmethod_12 {
	ChromeDriver driver;
	//step1
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement visa;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement credit;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement netbanking;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement UPI;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement EMI;
	
		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[6]")
		WebElement cash_on_delivery;
		
		
		
		
		
		//step2
		
		public void visa1()
		{
			
			visa.click();
		}
		
		public void credit()
		{
			
			credit.click();
		}
		public void netbanking1()
		{
			
			netbanking.click();
		}
		public void UPI1()
		{
			
			UPI.click();
		}
		public void EMI1()
		{
			
			EMI.click();
		}
		public void COD()
		{
			
			cash_on_delivery.click();
		}
		public WebElement COD1()
		{
			
			return cash_on_delivery;
		}
		//step3
		
				public Eachpaymentmethod_12(ChromeDriver driver)
				
				{
					
					PageFactory.initElements(driver, this);
				}
		

}
