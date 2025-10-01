package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pages.AlertsPage;
import pages.FramesPage;
import pages.MousePopUp;
import utils.BrowserFactory;

public class frameBookSteps {
    WebDriver driver;
    FramesPage framesPage;
    AlertsPage alertsPage;
    MousePopUp mousePopupPage;

    @Given("I am on Frames page")
    public void i_am_on_frames_page() {
        driver = BrowserFactory.getDriver();
        driver.get("https://demoqa.com/frames");
        framesPage = new FramesPage(driver);
    }

    @When("I switch inside frame")
    public void i_switch_inside_frame() {
        framesPage.switchToFrame();
    }

    @Then("I should read frame text")
    public void i_should_read_frame_text() {
        Assert.assertTrue(framesPage.getFrameText().contains("This is a sample page"));
        BrowserFactory.quitDriver();
    }

    @Given("I am on Alerts page")
    public void i_am_on_alerts_page() {
        driver = BrowserFactory.getDriver();
        driver.get("https://demoqa.com/alerts");
        alertsPage = new AlertsPage(driver);
    }

    @When("I click alert button")
    public void i_click_alert_button() {
        alertsPage.clickAlertButton();
    }

    @Then("I accept alert")
    public void i_accept_alert() {
        alertsPage.acceptAlert();
        BrowserFactory.quitDriver();
    }

    @Given("I am on Mouse Popup page")
    public void i_am_on_mouse_popup_page() {
        driver = BrowserFactory.getDriver();
        driver.get("https://demoqa.com/menu");
        mousePopupPage = new MousePopUp(driver);
    }

    @When("I hover on menu")
    public void i_hover_on_menu() {
        mousePopupPage.hoverOnMenu();
    }

    @Then("I see popup")
    public void i_see_popup() {
        Assert.assertTrue(mousePopupPage.isPopupDisplayed());
        BrowserFactory.quitDriver();
    }
}