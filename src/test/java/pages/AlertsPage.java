package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage{
	private By alertButton=By.id("alertButton");
	
	public AlertsPage(WebDriver driver) {
		super(driver);
	}
	public void clickAlertButton() {
		driver.findElement(alertButton).click();
	}
	public void acceptAlert() {
        driver.switchTo().alert().accept(); // OK दबाया
    }
}
