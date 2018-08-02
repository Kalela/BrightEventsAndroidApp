package com.andela.philskiiiwalker.brighteventsandroidapp.login;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;
import com.andela.philskiiiwalker.brighteventsandroidapp.registration.view.SignUpActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> activityLoginTestRule = new ActivityTestRule<>(LoginActivity.class);


    @Test
    public void loginActivityIsCreated() {
        onView(withId(R.id.signinFormLayout)).check(matches(isDisplayed()));
    }

    @Test
    public void onClickSignUpLink() {
        onView(withId(R.id.signInToSignUpLinkTextView)).perform(click());
        onView(withId(R.id.signUpTitleTextView)).check(matches(isDisplayed()));
    }
}