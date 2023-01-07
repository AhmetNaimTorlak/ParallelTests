package com.Finder_Parallel.stepDefinitions;

import com.Finder_Parallel.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){

        System.out.println("This is coming from before method");
        //Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After          //--> After method cucmber'dan gelmeli
    public void tearDown(Scenario scenario){  //--> tüm senaryolardan önce çalışır --> testNG de ki aftermethod gibi

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
    }
}
