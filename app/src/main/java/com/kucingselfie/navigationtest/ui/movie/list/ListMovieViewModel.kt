package com.kucingselfie.navigationtest.ui.movie.list

import androidx.lifecycle.ViewModel
import com.kucingselfie.navigationtest.model.Movie
import com.kucingselfie.navigationtest.util.DataDummy.generateMovies

class ListMovieViewModel : ViewModel() {
    fun getMovies() : List<Movie> {
        return generateMovies()
    }
}
