//This class is for test cases of four functionalities of a calculator
//Author - Sumedha Singh

package com.example.calulator;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class TestPlan {
    @Rule
    public ActivityScenarioRule<MainActivity> activityActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    //Test case 1 to check Multiplication functionality

    @Test()
    public void multiplicationTest() {
        CalculatorHomePage.clickButton(CalculatorHomePage.getTwoButton());
        Util.logTest("Calculator button_2_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getMultiplyButton());
        Util.logTest("Calculator button_mult_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getThreeButton());
        Util.logTest("Calculator button_3_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getEqualsToButton());
        Util.logTest("Calculator button_=_pressed");
        CalculatorHomePage.resultMatches(CalculatorHomePage.getResultTextField(), "6.0");
    }

    //Test case 2 to check Division functionality

    @Test()
    public void divisionTest() {
        CalculatorHomePage.clickButton(CalculatorHomePage.getFiveButton());
        Util.logTest("Calculator button_5_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getDivideButton());
        Util.logTest("Calculator button_divide_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getFourButton());
        Util.logTest("Calculator button_4_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getEqualsToButton());
        Util.logTest("Calculator button_=_pressed");
        CalculatorHomePage.resultMatches(CalculatorHomePage.getResultTextField(), "1.25");
    }

    //Test case 3 to check Addition functionality

    @Test()
    public void additionTest() {
        CalculatorHomePage.clickButton(CalculatorHomePage.getSixButton());
        Util.logTest("Calculator button_6_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getPlusButton());
        Util.logTest("Calculator button_plus_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getSevenButton());
        Util.logTest("Calculator button_7_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getEqualsToButton());
        Util.logTest("Calculator button_=_pressed");
        CalculatorHomePage.resultMatches(CalculatorHomePage.getResultTextField(), "13.0");
    }

    //Test case 1 to check Subtraction functionality

    @Test()
    public void subtractionTest() {
        CalculatorHomePage.clickButton(CalculatorHomePage.getNineButton());
        Util.logTest("Calculator button_9_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getMinusButton());
        Util.logTest("Calculator button_minus_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getEightButton());
        Util.logTest("Calculator button_8_pressed");
        CalculatorHomePage.clickButton(CalculatorHomePage.getEqualsToButton());
        Util.logTest("Calculator button_=_pressed");
        CalculatorHomePage.resultMatches(CalculatorHomePage.getResultTextField(), "1.0");
    }
}