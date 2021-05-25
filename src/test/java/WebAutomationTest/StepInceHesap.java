package WebAutomationTest;

import WebAutomationBase.BaseTest;
import com.thoughtworks.gauge.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class StepInceHesap extends BaseTest {
    private final Logger log = LogManager.getLogger(StepInceHesap.class);

    
    @Step("dene")
    public void firstTest(){
        log.info("denemeeeeeeeeeeee");
    }
}
