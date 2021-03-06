package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static cloud.autotests.helpers.DriverHelper.getConsoleLogs;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Title")
    void generatedTest() {
        step("Open \"https://www.google.com/\"", () -> {
            // todo just add selenium action
        });

        step("fill in the search field \"qa guru\"", () -> {
            // todo just add selenium action
        });

        step("Check that \"https://qa.guru\" is the first in the list", () -> {
            // todo just add selenium action
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...' and the page has 'title' tag")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.google.com/'", () ->
            open("https://www.google.com/"));

        step("Page title should have text 'Bevor Sie zur Google Suche weitergehen'", () -> {
            String expectedTitle = "Bevor Sie zur Google Suche weitergehen";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...'")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.google.com/'", () ->
            open("https://www.google.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}