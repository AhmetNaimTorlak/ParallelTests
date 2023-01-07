package com.Finder_Parallel.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(

        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports.html",
        "rerun:target/rerun.txt"
        },

        features = "src/test/resources/features",
        glue = "com/Finder_Parallel/stepDefinitions",
        dryRun =false,
        tags = "@wip"
)
@RunWith(Cucumber.class)
public class CukesRunner {
}
