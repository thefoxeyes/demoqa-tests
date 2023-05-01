import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadTimeout = 600000;
    }
    @AfterAll
    static void afterAll() {
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
    }
}
