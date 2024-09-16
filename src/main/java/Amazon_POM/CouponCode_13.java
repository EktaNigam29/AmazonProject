package Amazon_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponCode_13 {
	
	ChromeDriver driver;
	//step1
	
	@FindBy(xpath="//input[@id='spc-gcpromoinput']")
	WebElement textbox;
	
		@FindBy(xpath="(//input[@class='a-button-input'])[2]")
		WebElement apply;
		
		
	
		
		
		//step2
		
		public void box()
		{
			
			textbox.sendKeys("123456"+Keys.ENTER);
		}
		public WebElement box1()
		{
			
			return textbox;
		}
		public void apply1()
		{
			
			apply.click();
		}
		
		//step3
		
				public CouponCode_13(ChromeDriver driver)
				
				{
					
					PageFactory.initElements(driver, this);
				}
		

}
