import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTestSearch {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

        @Test
        void searchTest() {
            open("https://github.com/");
            $(".HeaderMenu").$(byText("Solutions")).hover();
            $(".list-style-none").$(byText("Enterprise")).click();
            sleep(5000);
            $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
        }

}

