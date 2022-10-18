import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    public void softAssertionsTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(byText("Soft assertions")).click();
        $(byText("3. Using JUnit5 extend test class:")).should(exist);
    }
}
