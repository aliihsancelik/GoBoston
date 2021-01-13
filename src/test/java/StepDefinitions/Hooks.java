package StepDefinitions;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;


public class Hooks {

    private static final Logger logger = Logger.getLogger(Hooks.class);

    @Before
    public void setup(){

        logger.info("Before the Setup");
        Driver.getDriver().get(ConfigurationReader.get("url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @After
    public void closure(Scenario scenario){

       if(scenario.isFailed()){
           final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot,"image/png","screenshot");
       }


        Driver.closure();
        logger.info("After the Closure");
   }
}
