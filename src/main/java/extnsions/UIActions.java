package extnsions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilets.CommonOps;

import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step("Click on Element")
    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();

    }

    @Step("Update text Element")
    public static void updateText(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Update dropdown Element")
    public static void updateDropDwon(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);

    }

    @Step("Mouse Hover Element")
    public static void mouseHover(WebElement elem1, WebElement elem2) {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    @Step("Update text Element as Humen")
    public static void updateTextHumen(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        for (char ch:text.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
            elem.sendKeys(ch + "");
        }
    }

    @Step("Insert Key ")
    public static void insertKey(WebElement elem, Keys value) {
        elem.sendKeys(value);
    }

    @Step("Mouse Hover Element")
    public static void mouseHover(WebElement elem1) {
        action.moveToElement(elem1).click().build().perform();
    }
}
