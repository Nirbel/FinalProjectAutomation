package extnsions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilets.CommonOps;

import java.util.List;

import static org.testng.AssertJUnit.*;
import static org.testng.AssertJUnit.assertEquals;

public class Verfications extends CommonOps {

    @Step("verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step("verify num Of Elements")
    public static void numOfElements(List<WebElement> elems, int expected) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), expected);
    }

    @Step("verify visbility Of Elements(softAssertion)")
    public static void visbilityOfElements(List<WebElement> elems) {
        for (WebElement elem : elems) {
            softAssert.assertTrue(elem.isDisplayed(), "sorry " + elem.getText() + "not displayed ");
        }
        softAssert.assertAll("Some elements were not displayed");
    }

    @Step("Verify Element visual")
    public static void visualElement(String expectedImageName) {

        try {
            screen.find(getData("ImageRepo") + expectedImageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error Comparing Image File:" + findFailed);
            fail("Error Comparing Image File:" + findFailed);
        }
    }


    @Step("Verify Element Displayed")
    public static void existanceOfElement(List<WebElement> elements) {
        assertTrue(elements.size() > 0);
    }

    @Step("Verify Element not Displayed")
    public static void notexistanceOfElement(List<WebElement> elements) {
        assertFalse(elements.size() > 0);
    }

    @Step("Verify Text with Text")
    public static void verifyText(String actual, String expected) {
        assertEquals(actual, expected);
    }

    @Step("Verify Number with Number")
    public static void verifyNumber(int expected, int actual) {
        assertEquals(expected, actual);
    }
}
