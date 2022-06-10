package com.noni.moviecatalogue

import com.noni.moviecatalogue.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/upcoming?api_key=10b220b6a62673f74d3efe00f27e3c98")
    fun getMovieList(): Call<MovieResponse>
}