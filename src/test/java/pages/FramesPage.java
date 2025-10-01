package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage{
	private By frameLocator=By.id("frame1");
	private By inputBox=By.id("sampleHeading");
	
	public FramesPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void switchToFrame() {
		driver.switchTo().frame(driver.findElement(frameLocator));
	}
	
	 public String getFrameText() {
	        return driver.findElement(inputBox).getText(); // Frame के अंदर text read
	    }

}
