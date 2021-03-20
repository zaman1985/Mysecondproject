package stepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C://Users//opuny//Documents//GitHub//Mysecondproject//src//test//java//features",glue="stepDefinition",plugin={"json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
