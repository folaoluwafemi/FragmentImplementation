package com.example.myfragmentimplementation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfragmentimplementation.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private lateinit var name: String
    private lateinit var email: String
    private lateinit var institution: String

    override fun onCreate(savedInstanceState: Bundle?) {
        arguments?.let {
            name = it.getString("name").toString()
            email = it.getString("email").toString()
            institution = it.getString("institution").toString()
        }
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.result1.text = name
        binding.result2.text = email
        binding.result3.text = institution
    }
}