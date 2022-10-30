package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/features/ZerodhaAccountTrafficSearch.feature"}
        ,glue = {"stepDefinitions"}
    //    ,tags = "@gmail"
)
public class TestRunner extends AbstractTestNGCucumberTests {

  
}