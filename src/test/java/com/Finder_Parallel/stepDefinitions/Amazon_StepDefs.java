package com.Finder_Parallel.stepDefinitions;

import com.Finder_Parallel.pages.AmazonPage;
import com.Finder_Parallel.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Amazon_StepDefs {
    AmazonPage amazonPage = new AmazonPage();
    boolean match;

    @Given("The user should be on Amazon home page")
    public void the_user_should_be_on_amazon_home_page() {
        Driver.get().get("https://www.amazon.com");
        String actualTitleAmazon = Driver.get().getTitle();
        String expectedTitleAmazon = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals("You are NOT on the login page", expectedTitleAmazon, actualTitleAmazon);
    }

    @When("The user search {string} to buy on Amazon")
    public void the_user_search_to_buy_on_Amazon(String product) {
        amazonPage.searchBox_loc.sendKeys(product);
        amazonPage.searchBtn_loc.click();
    }

    @When("The user should be able to see what they want")
    public void the_user_should_be_able_to_see_what_they_want() {
        amazonPage.selectStar_loc.click();
        Select select = new Select(amazonPage.dropDownSort_loc);
        select.selectByVisibleText("Avg. Customer Review");
    }

    @Then("The user see the cheapest {string} on Amazon")
    public void the_user_see_the_cheapest_on_Amazon(String product) {
        amazonPage.product_loc.click();
        //String actualProductName = amazonPage.productName_loc.getText();
        //if(actualProductName.toLowerCase().contains(product)){
        //    match = true;
        //}else {
        //    match = false;
        //}
        //Assert.assertTrue("The product could NOT find",match);
    }
}
