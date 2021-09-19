package com.example.myapplication.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.Tarifs
import com.example.myapplication.databinding.FragmentInfoBinding
import java.io.Serializable

class InfoFragment : Fragment() {

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_info, container, false)
        val binding = FragmentInfoBinding.bind(view)
        val data = arguments?.getSerializable("key") as Tarifs
        binding.textView.text = "${data.description}\n\n ${data.image}"
        return view
    }
}