package com.mews.app.bloc.example

import com.mews.app.bloc.android.BlocViewModel
import kotlinx.coroutines.flow.FlowCollector

class MainViewModel : BlocViewModel<MainEvent, MainState>() {
    override val initialState: MainState = MainState()

    override suspend fun FlowCollector<MainState>.mapEventToState(event: MainEvent) = when (event) {
        MainEvent.Increment -> emit(state.copy(value = state.value + 1))
        MainEvent.Decrement -> emit(state.copy(value = state.value - 1))
    }
}
