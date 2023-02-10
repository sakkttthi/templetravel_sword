package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = ".//Feature",
	glue = "stepdefinitions",
	dryRun = false,
	tags = ("@HRJobPosition"),
//	tags = ("@1Login or @2smoke or @Designation or @AddEmployee or @CreateProject or @Announcement or @Feedback or @SelfReport or @Report or @LeaveReport or @HRJobPosition" ),
	
	plugin = {"pretty","html:test-output"}
//	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)

public class testRunner  {
	
}