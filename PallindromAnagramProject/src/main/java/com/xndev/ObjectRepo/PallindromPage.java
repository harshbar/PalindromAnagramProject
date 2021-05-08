package com.xndev.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PallindromPage {

	@FindBy(xpath = "//a[@title='Excelon Development']")
	private WebElement excelonLogo;
	
	@FindBy(linkText = "Testing")
	private WebElement testingLink;
	
	@FindBy(linkText = "Placement")
	private WebElement placementLink;
	
	@FindBy(linkText = "Writing")
	private WebElement writingLink;

	@FindBy(linkText = "Consulting")
	private WebElement consultingLink;
	
	@FindBy(linkText = "Software")
	private WebElement softwareLink;
	
	@FindBy(linkText = "Blog")
	private WebElement blogLink;
	
	@FindBy(className = "fa-envelope")
	private WebElement envelopeImg;
	
	@FindBy(xpath = "(//a[@class='tb-search-trigger menu-btn']/i)[1]")
	private WebElement searchOpt;
	
	@FindBy(xpath = "(//a[@class='tb-side-trigger menu-btn']/span)[1]")
	private WebElement hamburgerMenu;
	
	@FindBy(css = "h1.entry-title")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//p[text()='Is This a Palindrome?']")
	private WebElement palindromeHeader;
	
	@FindBy(id = "originalWord")
	private WebElement palindromeTextbox;
	
	@FindBy(xpath = "//input[@onclick='isPalindrome()']")
	private WebElement palindromeSubmitBtn;
	
	@FindBy(id = "palindromeResult")
	private WebElement palindromeResult;
	
	@FindBy(xpath = "//p[text()=' Is This an Anagram?']")
	private WebElement anagramHeader;
	
	@FindBy(id = "anagramWord")
	private WebElement anagramTextbox;
	
	@FindBy(xpath = "//input[@onclick='makeAnagram()']")
	private WebElement anagramSubmitBtn;
	
	@FindBy(id = "anagramResult")
	private WebElement anagramResult;

	public PallindromPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getExcelonLogo() {
		return excelonLogo;
	}

	public WebElement getTestingLink() {
		return testingLink;
	}

	public WebElement getPlacementLink() {
		return placementLink;
	}

	public WebElement getWritingLink() {
		return writingLink;
	}

	public WebElement getConsultingLink() {
		return consultingLink;
	}

	public WebElement getSoftwareLink() {
		return softwareLink;
	}

	public WebElement getBlogLink() {
		return blogLink;
	}

	public WebElement getEnvelopeImg() {
		return envelopeImg;
	}

	public WebElement getSearchOpt() {
		return searchOpt;
	}

	public WebElement getHamburgerMenu() {
		return hamburgerMenu;
	}

	public WebElement getPageHeader() {
		return pageHeader;
	}

	public WebElement getPalindromeHeader() {
		return palindromeHeader;
	}

	public WebElement getPalindromeTextbox() {
		return palindromeTextbox;
	}

	public WebElement getPalindromeSubmitBtn() {
		return palindromeSubmitBtn;
	}

	public WebElement getPalindromeResult() {
		return palindromeResult;
	}

	public WebElement getAnagramHeader() {
		return anagramHeader;
	}

	public WebElement getAnagramTextbox() {
		return anagramTextbox;
	}

	public WebElement getAnagramSubmitBtn() {
		return anagramSubmitBtn;
	}

	public WebElement getAnagramResult() {
		return anagramResult;
	}
	
	public void enterPalindrom(String data) {
		palindromeTextbox.sendKeys(data);
		palindromeSubmitBtn.click();
	}
	
	public void enterAnagram(String data) {
		anagramTextbox.sendKeys(data);
		anagramSubmitBtn.click();
	}
	
	public String capturePalindromResult() {
		return palindromeResult.getText();
	}
	
	public String captureAnagramResult() {
		return anagramResult.getText();
	}
}





















