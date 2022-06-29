package pageobject.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num0Button']")
    public WebElement btn_zero;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num1Button']")
    public WebElement btn_one;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num2Button']")
    public WebElement btn_two;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num3Button']")
    public WebElement btn_three;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num4Button']")
    public WebElement btn_four;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num5Button']")
    public WebElement btn_five;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num6Button']")
    public WebElement btn_six;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num7Button']")
    public WebElement btn_seven;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num8Button']")
    public WebElement btn_eight;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='num9Button']")
    public WebElement btn_nine;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='plusButton']")
    public WebElement btn_plus;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='minusButton']")
    public WebElement btn_minus;


    @FindBy(how = How.XPATH, using = "//*[@AutomationId='equalButton']")
    public WebElement btn_equals;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='multiplyButton']")
    public WebElement btn_multiply;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='divideButton']")
    public WebElement btn_divide;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='clearButton']")
    public WebElement btn_clear;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='clearEntryButton']")
    public WebElement btn_clearEntry;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement field_result;
}
