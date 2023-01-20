package com.example.moviedb.core.data.repository

import com.example.moviedb.core.data.remote.MovieRemoteDataSource
import com.example.moviedb.core.data.remote.Resource
import com.example.moviedb.core.data.remote.network.ApiResponse
import com.example.moviedb.core.domain.model.Movie
import com.example.moviedb.core.domain.repository.IMovieRepository
import com.project.proyek_akhir_mobile_programming.di.utils.mapMovieResponseToDomain
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow

class MovieRepository(private val movieRemoteDataSource: MovieRemoteDataSource): IMovieRepository {
    override fun getMovies(): Flow<Resource<List<Movie>>> =
        flow {
            emit(Resource.Loading())
            when(val apiResponse = movieRemoteDataSource.getMovies().first()){
                is ApiResponse.Success -> emit(Resource.Success(apiResponse.data.map { mapMovieResponseToDomain(it) }))
                is ApiResponse.Empty -> emit(Resource.Success(null))
                is ApiResponse.Error -> emit(Resource.Error(apiResponse.errorMessage))
            }
        }

}