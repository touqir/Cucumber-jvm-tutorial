package com.tutorials.organization;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

/*
 * these are the options passed in
 * to cucumber when using JUnit
 */
@Cucumber.Options(

	format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"}
//        ,tags = { "@spirits" }
)

/*
 * this class is the class called by the
 * JUnit runner that runs this module. It
 * also passes in all the options to cucumber.
 * Without a runner class like this one cucumber
 * will not run. This class should never have a 
 * body.
 */
public class RunCukesTest {
}



















