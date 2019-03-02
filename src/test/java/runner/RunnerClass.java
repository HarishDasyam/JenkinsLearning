package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;/*
import cucumber.api.SnippetType;*/
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Login.feature",glue="steps",
monochrome=true/*,dryRun=true,snippets = SnippetType.CAMELCASE*//*,snippets=SnippetType.CAMELCASE*/)
public class RunnerClass
{
}