package com.Finder_Parallel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPage extends BasePage{

    @FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
    public WebElement searchBox_loc;

    @FindBy(xpath = "//input[@id=\"nav-search-submit-button\"]")
    public WebElement searchBtn_loc;

    @FindBy(xpath = "//i[@class=\"a-icon a-icon-star-medium a-star-medium-4\"]")
    public WebElement selectStar_loc;

    @FindBy(xpath = "//select[@data-action=\"a-dropdown-select\"]")
    public WebElement dropDownSort_loc;

    @FindBy(xpath = "//img[@data-image-index=\"2\"]")
    public WebElement product_loc;

    @FindBy(xpath = "//span[@id=\"productTitle\"]")
    public WebElement productName_loc;


}
