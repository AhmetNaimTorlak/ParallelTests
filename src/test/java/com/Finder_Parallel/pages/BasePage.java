package com.Finder_Parallel.pages;

import com.Finder_Parallel.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    WebDriver driver;

    public BasePage(){
    PageFactory.initElements(Driver.get(),this);

    }
}
