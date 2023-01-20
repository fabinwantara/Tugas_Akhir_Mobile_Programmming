package com.example.moviedb.ui.tvshow

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moviedb.databinding.FragmentTvShowBinding
import com.example.moviedb.ui.detail.DetailActivity

class TvShowFragment : Fragment() {

    private var _binding: FragmentTvShowBinding? = null
    private lateinit var binding: FragmentTvShowBinding

    private lateinit var adapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        if (_binding == null){
            _binding = FragmentTvShowBinding.inflate(inflater, container, false)
            binding = _binding as FragmentTvShowBinding
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = TvShowAdapter().apply {
            onClick {
                Intent(activity, DetailActivity::class.java).also { intent ->
                    intent.putExtra(DetailActivity.EXTRA_TYPE, DetailActivity.data[1])
                    intent.putExtra(DetailActivity.EXTRA_DATA, it)
                    startActivity(intent)
                }
            }
        }

        getTvShow()
    }

    private fun getTvShow() {
        // TODO
    }

    private fun showLoading(state: Boolean){
        binding.apply {
            if (state){
                progressBar.visibility = View.VISIBLE
                rvTvshow.visibility = View.GONE
            }else{
                progressBar.visibility = View.GONE
                rvTvshow.visibility = View.VISIBLE
            }
        }
    }

}