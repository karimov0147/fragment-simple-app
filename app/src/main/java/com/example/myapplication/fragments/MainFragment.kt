package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_main, container, false)
        var binding = FragmentMainBinding.bind(view)

        binding.cardView2.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_tarif_Fragment)
        }
        return view
    }
}