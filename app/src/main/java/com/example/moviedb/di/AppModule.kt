package com.example.moviedb.di

import com.example.moviedb.core.domain.usecase.movie.MovieInteractor
import com.example.moviedb.core.domain.usecase.movie.MovieUseCase
import com.example.moviedb.ui.movie.MovieViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
}