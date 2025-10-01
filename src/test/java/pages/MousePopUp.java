package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MousePopUp extends BasePage {
    private By hoverMenu = By.id("hoverMenu"); // Hover element
    private By popup = By.id("popup");         // Popup locator

    public MousePopUp(WebDriver driver) {
        super(driver);
    }

    public void hoverOnMenu() {
        WebElement menu = driver.findElement(hoverMenu);
        actions.moveToElement(menu).perform(); // Mouse hover
    }

    public boolean isPopupDisplayed() {
        return driver.findElement(popup).isDisplayed(); // Popup दिखाई दे रहा?
    }
}