package com.example.compose.rally

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.compose.rally.ui.overview.OverviewBody
import org.junit.Rule
import org.junit.Test

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 2022/12/04
 * @desc
 **/
class OverviewScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun overviewScreen_alertsDisplayed() {
        composeTestRule.setContent {
            OverviewBody()
        }
        composeTestRule.onNodeWithText("Alerts").assertIsDisplayed()
    }
}