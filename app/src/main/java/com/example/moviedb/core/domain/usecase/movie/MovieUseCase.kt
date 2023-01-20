package com.example.moviedb.core.domain.usecase.movie

import com.example.moviedb.core.data.remote.Resource
import com.example.moviedb.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieUseCase{
    fun getMovies(): Flow<Resource<List<Movie>>>
}