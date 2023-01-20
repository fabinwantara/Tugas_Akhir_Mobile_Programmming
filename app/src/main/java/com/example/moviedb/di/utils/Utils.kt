package com.example.moviedb.di.utils

import com.example.moviedb.core.data.remote.response.MovieResponse
import com.example.moviedb.core.domain.model.Movie

fun mapMovieResponseToDomain(input: MovieResponse) =
    Movie(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )
