import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {

    @BeforeEach
    void Configuration() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen=true;
    }

    @Test
    void FormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Yaroslav");
        $("#lastName").setValue("shurzG");
        $("#userEmail").setValue("shurzG@gmail.com");
        $(".custom-control-label").click();
        $("#userNumber").setValue("88005553535");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__day--030").click();
        $("#currentAddress").setValue("Some Address");
        $(".css-1pahdxg-control").click();

//        site govno mamonta, knopki submita net, polovina poley dlya vvoda ne rabotet
    }
}
