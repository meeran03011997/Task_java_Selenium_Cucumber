package com.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( publish=true,dryRun = false,monochrome=true,glue = "com.stepdefintion",stepNotifications = true,
features="C:\\Users\\sathish kumar .s\\eclipse-workspace\\TestVagrant1\\src\\test\\resources\\Feature")


public class TestRunner{



}



