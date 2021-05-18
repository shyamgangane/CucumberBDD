package com.cucumberbdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

        features="classpath:features",//to tell cucumber where is ur feature file
        glue="com.cucumberbdd.stepdef", // to tell cucumber where is ur step def code
        plugin = {"pretty", // to generate reports
            "html:target/html/htmlreport.html",
            "json:target/json/file.json",
            },
        monochrome = true,
        dryRun=false // to tell whether to test run(true) or actual run(false)
        )	
		
		










public class TestRunner {

}
