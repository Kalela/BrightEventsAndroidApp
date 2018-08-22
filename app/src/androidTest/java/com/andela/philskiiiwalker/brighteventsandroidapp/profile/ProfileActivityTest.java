package com.andela.philskiiiwalker.brighteventsandroidapp.profile;

import android.support.test.rule.ActivityTestRule;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;
import com.andela.philskiiiwalker.brighteventsandroidapp.events.EventsActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class ProfileActivityTest {

    @Rule
    ActivityTestRule<ProfileActivity> profileActivityActivityTestRule = new ActivityTestRule<>(ProfileActivity.class);

    @Rule
    ActivityTestRule<EventsActivity> eventsActivityActivityTestRule = new ActivityTestRule<>(EventsActivity.class);

    @Test
    public void onCreate() {
        onView(withId(R.id.profileTitleTextView)).check(matches(isDisplayed()));
    }

    @Test
    public void onClickLogout() {
        onView(withId(R.id.logoutButton)).perform(click());
        onView(withId(R.id.allEventsTitleTextView)).check(matches(isDisplayed()));
    }

}