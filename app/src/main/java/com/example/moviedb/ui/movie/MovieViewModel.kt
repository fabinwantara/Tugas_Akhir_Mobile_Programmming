package com.example.moviedb.ui.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.moviedb.core.domain.usecase.movie.MovieUseCase

class MovieViewModel(private val useCase: MovieUseCase): ViewModel() {
    fun getMovies() = useCase.getMovies().asLiveData()
}