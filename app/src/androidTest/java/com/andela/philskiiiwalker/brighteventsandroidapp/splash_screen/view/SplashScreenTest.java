package com.andela.philskiiiwalker.brighteventsandroidapp.splash_screen.view;

import android.support.test.rule.ActivityTestRule;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;
import com.andela.philskiiiwalker.brighteventsandroidapp.login.LoginActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class SplashScreenTest {

    @Rule
    public ActivityTestRule<SplashScreen> activityLoginTestRule = new ActivityTestRule<>(SplashScreen.class);

    @Test
    public void splashScreenIsDisplayed() {
        onView(withId(R.id.splashTitleTextView)).check(matches(isDisplayed()));
    }

    @Test
    public void after3secondsOpensLogin() {
        // Idling resource
        onView(withId(R.id.signinFormLayout)).check(matches(isDisplayed()));
    }
}