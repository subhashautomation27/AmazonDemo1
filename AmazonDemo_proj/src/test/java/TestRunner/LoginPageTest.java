package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features="src\\test\\resource\\features\\login.feature",
					glue={"stepdefination"}
		
		)
public class LoginPageTest {

}
