package com.cikup.news.presentation.onboarding

import androidx.annotation.DrawableRes
import com.cikup.news.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Stay Informed, Anytime, Anywhere",
        description = "Get the latest news from around the world, tailored to your interests. Whether you're at home or on the go, our app keeps you updated with breaking stories, in-depth analysis, and trending topics.",
        image = R.drawable.ic_launcher_foreground
    ),
    Page(
        title = "Personalized News Just for You",
        description = "Choose your favorite topics and sources, and let our app curate a newsfeed that matches your preferences. From politics to sports, tech to entertainment, we’ve got you covered.",
        image = R.drawable.ic_launcher_background
    ),
    Page(
        title = "Quick, Reliable, and Easy to Use",
        description = "With a clean and intuitive design, our app makes it easy to find and read the news that matters most to you. Stay informed without the clutter—just the stories you care about, delivered fast.",
        image = R.drawable.ic_launcher_foreground
    )
)