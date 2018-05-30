package com.sample.cucumber.Facebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//Computer//workspace//Facebook//Feature//Facebook.feature",glue={"FacebookStep"})
public class JUnitRunner {

}
