package com.kucingselfie.navigationtest.ui.movie.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.kucingselfie.navigationtest.databinding.DetailMovieFragmentBinding

class DetailMovieFragment : Fragment() {

    private lateinit var viewModel: DetailMovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DetailMovieFragmentBinding.inflate(inflater)
        val model = DetailMovieFragmentArgs.fromBundle(arguments!!).model
        binding.model = model
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailMovieViewModel::class.java)
    }
}
