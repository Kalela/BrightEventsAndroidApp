package com.andela.philskiiiwalker.brighteventsandroidapp.search;

import android.support.test.rule.ActivityTestRule;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class SearchTest {

    @Rule
    ActivityTestRule<SearchActivity> searchActivityActivityTestRule = new ActivityTestRule<>(SearchActivity.class);

    @Test
    public void onCreate() {
        onView(withId(R.id.searchTitleTextView)).check(matches(isDisplayed()));
    }

    @Test
    public void onClickSearchButtonWithResponse() {
        // add input
        onView(withId(R.id.searchButton)).perform(click());
        onView(withId(R.id.searchEventsRecyclerViewLayout)).check(matches(isDisplayed()));
    }

    @Test
    public void onClickSearchButtonWithoutResponse() {
        // add input
        onView(withId(R.id.searchButton)).perform(click());
        onView(withId(R.id.searchEventsAlert)).check(matches(isDisplayed()));
    }

}