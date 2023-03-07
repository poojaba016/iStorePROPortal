package com.istoreproportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath = "//div[@id='logo']")
	WebElement applicationLogo;
	@FindBy(xpath = "//span[text()='Home' and @class='title white']")
	WebElement goToHome;
	@FindBy(xpath = "//span[text()='Operations' and @class='title']")
	WebElement operationsList;
	@FindBy(xpath = "//span[text()='Owners' and @class='title']")
	WebElement ownersList;
	@FindBy(xpath = "//span[text()='Management' and @class='title']")
	WebElement managementList;
	@FindBy(xpath = "//i[@class='fa fa-cog fa-2x pr-0']")
	WebElement ASNUploadPageNavigateButton;
	@FindBy(xpath = "//i[@class='fa fa-lock fa-2x']")
	WebElement lockProfileButton;
	@FindBy(xpath = "//li[@id='notification-menu']")
	WebElement notificationsMenu;
	@FindBy(xpath = "//span[@id='login-name']")
	WebElement loginNameDisplayed;

}
