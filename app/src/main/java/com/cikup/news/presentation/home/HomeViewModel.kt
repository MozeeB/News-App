package com.cikup.news.presentation.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.cikup.news.domain.usecases.news.GetNews
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    getNewsUseCase: GetNews
): ViewModel() {

    var state = mutableStateOf(HomeState())
        private set

    val news = getNewsUseCase(
        sources = listOf("bbc-news", "abc-news", "al-jazeera-english")
    ).cachedIn(viewModelScope)

    fun onEvent(event: HomeEvent) {
        when(event) {
            is HomeEvent.UpdateScrollValue -> updateScrollValue(event.newValue)
            is HomeEvent.UpdateMaxScrollingValue -> updateMaxScrollingValue(event.newValue)
        }
    }

    private fun updateScrollValue(newScrollValue: Int) {
        state.value = state.value.copy(scrollValue = newScrollValue)
    }

    private fun updateMaxScrollingValue(newValue: Int) {
        state.value = state.value.copy(maxScrollingValue = newValue)
    }
}