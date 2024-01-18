package Steps;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

        @Before
        public static void setUp() {
            BaseTest.setUpDriver();
            System.out.println("inside Before Hook");
        }

        @After
        public static <TakesScreenshot> void tearDown(Scenario scenario) {

//            if(scenario.isFailed()) {
//                final byte[] screenshot = ((TakesScreenshot) BaseTest.getDriver()).getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "image/png", scenario.getName());
//            }
            System.out.println("inside After Hook");
            BaseTest.tearDown();
        }


}
