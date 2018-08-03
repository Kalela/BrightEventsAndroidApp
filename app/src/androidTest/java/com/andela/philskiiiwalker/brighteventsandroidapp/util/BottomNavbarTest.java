package com.andela.philskiiiwalker.brighteventsandroidapp.util;

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

public class BottomNavbarTest {

    @Rule
    public ActivityTestRule<EventsActivity> eventsActivityActivityTestRule = new ActivityTestRule<>(EventsActivity.class);

    @Test
    public void onClickAllEvents() {
        onView(withId(R.id.navbarAllEventsMenuItem)).perform(click());
        onView(withId((R.id.allEventsTitleTextView))).check(matches(isDisplayed()));
    }

    @Test
    public void onClickMyEvents() {
        onView(withId(R.id.navbarMyEventsMenuItem)).perform(click());
        onView(withId((R.id.myEventsTitleTextView))).check(matches(isDisplayed()));
    }

    @Test
    public void onClickSearch() {
        onView(withId(R.id.navbarSearchEventsMenuItem)).perform(click());
        onView(withId((R.id.searchEventsTitleTextView))).check(matches(isDisplayed()));
    }

    @Test
    public void onClickProfile() {
        onView(withId(R.id.navbarProfileMenuItem)).perform(click());
        onView(withId((R.id.profileTitleTextView))).check(matches(isDisplayed()));
    }
}