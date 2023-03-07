package com.istoreproportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuOperations {

	
	WebDriver driver;
	@FindBy(xpath="//a[text()='Scans' and @href='#']")
	WebElement scanInList;
	@FindBy(xpath="//a[@href='/ScanIN/ScanINHome' and text()='Inbound Scan']")
	WebElement inboundScanMenu;
	@FindBy(xpath="//a[@id='doublescan-menu']")
	WebElement doubleScanMenu;
	@FindBy(xpath="//a[@href='/packHome' and text()='Pack Scan']")
	WebElement packScanMenu;
	
}
