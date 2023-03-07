package com.istoreproportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ASNImport {
	WebDriver driver;
	@FindBy(xpath="//i[@class='fa fa-cog fa-2x pr-0']")
	WebElement ASNUploadPageNavigateButton;
	@FindBy(xpath="//i[@class='fa fa-angle-double-up fa-3x text-success']")
	WebElement asnImportOptionButton;
	@FindBy(xpath="//i[@class='fa fa-refresh fa-lg clear-controls']")
	WebElement clearFieldsButton;
	@FindBy(xpath="//i[@class='fa fa-arrow-circle-left']")
	WebElement navigateBack;
	@FindBy(xpath="//i[@id='choose-template']")
	WebElement selectImportFile;
	@FindBy(xpath="//button[@id='import-template']")
	WebElement importTemplateButton;
	@FindBy(xpath="clear-import")
	WebElement clearImportButton;
}
