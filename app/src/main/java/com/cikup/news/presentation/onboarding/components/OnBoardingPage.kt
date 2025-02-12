package com.cikup.news.presentation.onboarding.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.cikup.news.R
import com.cikup.news.presentation.onboarding.Page
import com.cikup.news.ui.theme.NewsappTheme
import com.cikup.news.utils.Dimens.MediumPadding1
import com.cikup.news.utils.Dimens.MediumPadding2

@Composable
fun OnBoardingPage (
    modifier: Modifier = Modifier,
    page: Page
) {
   Column (modifier = modifier) {
       Image(
           modifier = modifier
               .fillMaxWidth()
               .fillMaxHeight(0.60f),
           painter = painterResource(id = page.image),
           contentDescription = null,
           contentScale = ContentScale.Crop
       )
       Spacer(modifier = modifier.height(MediumPadding1))
       Text(
           modifier = Modifier.padding(horizontal = MediumPadding2),
           text = page.title,
           style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
           color = colorResource(id = R.color.black)
       )
       Text(
           modifier = Modifier.padding(horizontal = MediumPadding2),
           text = page.description,
           style = MaterialTheme.typography.bodyMedium,
           color = colorResource(id = R.color.black)
       )
   }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun OnBoardingPagePreview() {
    NewsappTheme {
        OnBoardingPage(
            page = Page(
                title = "Lorem Ipsum is simply dummy",
                description = " Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                image = R.drawable.ic_launcher_background
            )
        )
    }
}