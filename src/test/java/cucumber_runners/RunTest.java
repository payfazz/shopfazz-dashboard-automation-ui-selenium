package cucumber_runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 

// Run all test case
@CucumberOptions(features="classpath:features",glue="classpath:stepdefinitions") 

//Run per module
//@CucumberOptions(features="classpath:features",glue="classpath:stepdefinitions",tags="@LoginDashboard,@MainMenu")

// Run per test case
//@CucumberOptions(features="classpath:features",glue="classpath:stepdefinitions",tags= {"@C25275,@C25259"}) 


public class RunTest {

}
