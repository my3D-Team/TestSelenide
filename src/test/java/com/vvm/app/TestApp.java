package com.vvm.app;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by maitbela on 08/02/2016.
 */
public class TestApp {

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();

    @Before
    public void beforeLanch() {
        open("http://google.com");
    }

    @Test
    public void lanceTest() {
        $(By.name("q")).setValue("VVM").pressEnter();
    }

    @After
    public void afterTest() {
        $(By.name("q")).shouldHave(text(""));
    }
}
