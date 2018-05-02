package comp680team7.com.clienthighscore;

import android.app.DatePickerDialog;
import android.support.test.espresso.contrib.PickerActions;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.widget.DatePicker;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Calendar;
import java.util.List;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Checks.checkNotNull;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ScoreListCreateActivityTest {

    @Rule
    public ActivityTestRule<ScoreListActivity> activityTestRule = new ActivityTestRule<>(ScoreListActivity.class);


    @Test
    public void addScoreTest() {
        onView(withId(R.id.newScoreFAB))
                .perform(click());

        Calendar instance = Calendar.getInstance();
        String gameName = "GameName_" + instance.getTimeInMillis();
        String gamePub = "GamePub_" + instance.getTimeInMillis();

        onView(withId(R.id.selectImageButton)).perform(click());
//        onView(withText("Gallery")).perform(click());
//        onView(withId)
//        activityTestRule.runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                activityTestRule.
//            }
//        });
//        onView(withId(R.id.gameName))
//                .perform(typeText(gameName));
//        onView(withId(R.id.gamePublisher))
//                .perform(typeText(gamePub));
//        onView(withId(R.id.datePublishedEditText))
//                .perform(click());
//        onView(withClassName(equalTo(DatePicker.class
//                .getName()))).perform(PickerActions.setDate(2017, 1, 2));
//        onView(withText("OK")).perform(click());
//        onView(withId(R.id.save)).perform(click());
//
//
//        RecyclerView gameListView = activityTestRule.getActivity().findViewById(R.id.gameListView);
//        int itemCount = gameListView.getAdapter().getItemCount();
//        onView(withId(R.id.gameListView)) //scroll to last added item; kind of bad, but it works
//                .perform(RecyclerViewActions.scrollToPosition(itemCount-1));
    }
}