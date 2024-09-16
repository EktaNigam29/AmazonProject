package Amazon_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout11 {
	ChromeDriver driver;
	//step1
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement use_this_address;
	
		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[6]")
		WebElement cash_on_delivery;
		
		
		 @FindBy(xpath="(//span[@class='a-declarative']/span/span/span/input)[2]")

		 WebElement use_this_payment;
		
		
		//step2
		
		public void address()
		{
			
			use_this_address.click();
		}
		
		public void cash()
		{
			
			cash_on_delivery.click();
		}
		public void payment()
		{
			
			use_this_payment.click();
		}
		//step3
		
				public Checkout11(ChromeDriver driver)
				
				{
					
					PageFactory.initElements(driver, this);
				}
		

}
