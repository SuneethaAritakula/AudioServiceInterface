package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(
/*        features = "src/test/resources/features",
        glue = "StepDefinitions",
        tags = {"@Smoke"},
        format = {
        
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "junit:target/cucumber-reports/CucumberTestReport.xml"},
               
                monochrome = true*/
                
                
 @CucumberOptions(features = "src/test/resources/features" ,
 glue = {"StepDefinitions"},
 tags = {"@Smoke"},
 plugin = { "pretty","json:target/cucumber-json/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/target/cucumber-reports/cucumber-html-reportsreport.html",
            "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"},
 monochrome = true
                				)





public class TestRunner {
	@AfterClass
	public static void teardown() {

		//Reporter.loadXMLConfig(new File("target/extent-config.xml"));
		//Reporter.setSystemInfo("user", System.getProperty("user.name"));
	//	Reporter.setSystemInfo("os", "Mac OSX");
		//Reporter.setTestRunnerOutput("Sample test runner output message");

}}


