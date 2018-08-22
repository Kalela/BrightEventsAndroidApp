package com.andela.philskiiiwalker.brighteventsandroidapp.registration.view;

import android.support.test.rule.ActivityTestRule;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class SignUpActivityTest {

    @Rule
    public ActivityTestRule<SignUpActivity> signupActivityTestRule = new ActivityTestRule<>(SignUpActivity.class);

    @Test
    public void signupActivityIsCreated() {
        onView(withId(R.id.signupFormConstraintLayout)).check(matches(isDisplayed()));
    }

    @Test
    public void onClickSignInLink() {
        onView(withId(R.id.signUpToSignInLinkTextView)).perform(click());
        onView(withId(R.id.signinFormLayout)).check(matches(isDisplayed()));
    }
}