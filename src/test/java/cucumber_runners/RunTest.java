package cucumber_runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="classpath:features",glue="classpath:stepdefinitions", tags="@MainMenu") 



public class RunTest {

}
