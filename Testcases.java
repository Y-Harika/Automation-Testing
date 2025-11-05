package CucumberTestcases;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Harika Yarra\\OneDrive\\Desktop\\Tricentis_POM_cucumber\\src\\main\\java\\BasePack\\vehicle.feature",glue={"RunstepsPack"})
public class Testcases {
  @Test
  public void f() {
  }
}
