import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    public void softAssertionsTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".Box--condensed").$("js-wiki-more-pages-link").click();
        $(".Box--condensed").shouldHave(text("SoftAssertions"));
        $(".Box--condensed").$(byText("SoftAssertions"));
        $(".markdown-body").$(byText("3. Using JUnit5 extend test class:")).shouldBe(visible);
    }
}
