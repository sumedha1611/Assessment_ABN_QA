//This is a base class which is used by calculator home page for basic functionalities like "Clicking Button"
//Author - Sumedha Singh
package com.example.calulator;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

public class EspressoBaseTest {
    public static void clickButton(Integer resourceId) {
        onView(withId(resourceId))
                .perform(click())
                .check(matches(isDisplayed()));
    }

    public static void resultMatches(Integer resourceId, String value) {
        onView(allOf(withId(resourceId), withText(value)))
                .check(matches(isDisplayed()));
    }
}
