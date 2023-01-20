package com.example.moviedb.core.domain.repository

import com.example.moviedb.core.data.remote.Resource
import com.example.moviedb.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {
    fun getMovies(): Flow<Resource<List<Movie>>>
}