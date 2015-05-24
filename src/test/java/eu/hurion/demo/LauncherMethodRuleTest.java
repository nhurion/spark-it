package eu.hurion.demo;

import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class LauncherMethodRuleTest extends FluentTest {
    public WebDriver webDriver = new HtmlUnitDriver();

    @Rule
    public ServerRule server = new ServerRule(4567);

    @Test
    public void helloTest() {
        goTo("http://localhost:4567/hello");
        assertThat(pageSource()).contains("Hello");
    }

    @Test
    public void worldTest() {
        goTo("http://localhost:4567/hello");
        assertThat(pageSource()).contains("World");
    }


    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }
}