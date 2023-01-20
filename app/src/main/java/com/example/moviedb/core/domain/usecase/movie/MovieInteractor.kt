package com.example.moviedb.core.domain.usecase.movie

import com.example.moviedb.core.data.remote.Resource
import com.example.moviedb.core.domain.model.Movie
import com.example.moviedb.core.domain.repository.IMovieRepository
import kotlinx.coroutines.flow.Flow

class MovieInteractor(private val repository: IMovieRepository): MovieUseCase {
    override fun getMovies(): Flow<Resource<List<Movie>>> = repository.getMovies()
}