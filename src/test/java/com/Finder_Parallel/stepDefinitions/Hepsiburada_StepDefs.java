package com.Finder_Parallel.stepDefinitions;

import com.Finder_Parallel.pages.HepsiburadaPage;
import com.Finder_Parallel.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Hepsiburada_StepDefs {
    HepsiburadaPage hepsiburadaPage = new HepsiburadaPage();
    @Given("The user should be on Hepsiburada home page")
    public void the_user_should_be_on_hepsiburada_home_page() {
        Driver.get().get("https://www.hepsiburada.com/");
        hepsiburadaPage.cerezCloser_loc.click();
        String actaulHepsiburadaTitle = Driver.get().getTitle();
        String expectedHepsiburadaTitle = "Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com";
        Assert.assertEquals("You are NOT on the home page",expectedHepsiburadaTitle,actaulHepsiburadaTitle);

    }
    @When("The user search {string} to buy on Hepsiburada")
    public void the_user_search_to_buy_on_hepsiburada(String productName) {
        hepsiburadaPage.searchBox_loc.sendKeys(productName);
        hepsiburadaPage.searchBtn_loc.click();
    }
    @Then("The user see the cheapest {string} on Hepsiburada")
    public void the_user_see_the_cheapest_on_hepsiburada(String expectedProductName) {
        hepsiburadaPage.product_loc.click();
        //String actualProductName = hepsiburadaPage.productName.getText();
        //Assert.assertEquals("NO match",expectedProductName,actualProductName);
    }
}
