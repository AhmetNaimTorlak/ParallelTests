package com.Finder_Parallel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HepsiburadaPage extends BasePage{

    @FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
    public WebElement cerezCloser_loc;

    @FindBy(xpath = "//input[@class=\"theme-IYtZzqYPto8PhOx3ku3c\"]")
    public WebElement searchBox_loc;

    @FindBy(xpath = "class=\"searchBoxOld-yDJzsIfi_S5gVgoapx6f\"")
    public WebElement searchBtn_loc;

    @FindBy(xpath = "//li[@class=\"productListContent-zAP0Y5msy8OHn5z7T_K_\"][@id=\"i1\"]")
    public WebElement product_loc;

    @FindBy(xpath = "//h1[contains(@*,'')]")
    public WebElement productName;



}
