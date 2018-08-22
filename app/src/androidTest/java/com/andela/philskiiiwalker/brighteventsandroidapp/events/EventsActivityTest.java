package com.andela.philskiiiwalker.brighteventsandroidapp.events;

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

public class EventsActivityTest {

    @Rule
    ActivityTestRule<EventsActivity> eventsActivityActivityTestRule = new ActivityTestRule<>(EventsActivity.class);

    //My events tests
    @Test
    public void onClickEventRSVP() {
        // Send RSVP
        onView(withId(R.id.rsvpButton)).perform(click());
        onView(withId(R.id.rsvpButtom)).check(R.color.bright_events_red);

        // Remove RSVP
        onView(withId(R.id.rsvpButton)).perform(click());
        onView(withId(R.id.rsvpButtom)).check(R.color.bright_events_green);
    }


    // All events tests
    @Test
    public void onClickEventDelete() {
        onView(withId(R.id.deleteEventButton)).perform(click());
        onView(withId(R.id.deleteEventModal)).check(matches(isDisplayed()));
    }

    @Test
    public void onClickEventEdit() {
        onView(withId(R.id.editEventButton)).perform(click());
        onView(withId(R.id.editEventModal)).check(matches(isDisplayed()));
    }

}