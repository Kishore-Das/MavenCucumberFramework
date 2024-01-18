package testRunner;

//import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(tags ="", features = {"src/test/resources/features"}, glue = {"Steps"}, plugin = {"pretty","html:target/Reports/report.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
