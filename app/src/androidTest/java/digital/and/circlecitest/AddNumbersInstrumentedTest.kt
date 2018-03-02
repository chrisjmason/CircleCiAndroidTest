package digital.and.circlecitest

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by cmason on 02/03/2018.
 */

@RunWith(AndroidJUnit4::class)
class AddNumbersInstrumentedTest{
    @get:Rule
    val activity = ActivityTestRule<MainActivity>(MainActivity::class.java,
            true,
            true)

    @Test
    fun enterNumbersAndClickButtonCorrectSolutionShown(){
        onView(withId(R.id.editText)).perform(typeText("1"))
        onView(withId(R.id.editText2)).perform(typeText("3"), closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textView2)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}