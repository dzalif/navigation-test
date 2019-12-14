package com.kucingselfie.navigationtest.ui.movie.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.kucingselfie.navigationtest.databinding.ListMovieFragmentBinding
import com.kucingselfie.navigationtest.model.DetailMovie

class ListMovieFragment : Fragment() {

    private lateinit var viewModel: ListMovieViewModel

    private lateinit var binding: ListMovieFragmentBinding

    private lateinit var adapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ListMovieFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ListMovieViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
        adapter = MovieAdapter {
            val model = DetailMovie(
                it.id,
                it.title,
                it.description,
                it.image
            )
            val action = ListMovieFragmentDirections.actionMovieFragmentToDetailMovieFragment(model)
            findNavController().navigate(action)
        }
        binding.rvMovie.adapter = adapter
    }
}
