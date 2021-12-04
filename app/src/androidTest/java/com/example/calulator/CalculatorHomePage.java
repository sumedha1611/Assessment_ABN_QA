//This class is for calculator home page and it's attributes
//Author - Sumedha Singh
package com.example.calulator;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

public class CalculatorHomePage extends EspressoBaseTest{
    public static int getZeroButton() {
        return R.id.button0;
    }

    public static int getOneButton() {
        return R.id.button1;
    }

    public static int getTwoButton() {
        return R.id.button2;
    }

    public static int getThreeButton() {
        return R.id.button3;
    }

    public static int getFourButton() {
        return R.id.button4;
    }

    public static int getFiveButton() {
        return R.id.button5;
    }

    public static int getSixButton() {
        return R.id.button6;
    }

    public static int getSevenButton() {
        return R.id.button7;
    }

    public static int getEightButton() {
        return R.id.button8;
    }

    public static int getNineButton() {
        return R.id.button9;
    }

    public static int getEqualsToButton() {
        return R.id.buttonEquals;
    }

    public static int getMultiplyButton() {
        return R.id.buttonMultiply;
    }

    public static int getResultTextField() {
        return R.id.result;
    }

    public static int getDivideButton() {
        return R.id.buttonDivide;
    }

    public static int getPlusButton() {
        return R.id.buttonPlus;
    }

    public static int getMinusButton() {
        return R.id.buttonMinus;
    }
}
