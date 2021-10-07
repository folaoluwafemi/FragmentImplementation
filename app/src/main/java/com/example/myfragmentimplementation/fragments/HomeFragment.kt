package com.example.myfragmentimplementation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.myfragmentimplementation.R
import com.example.myfragmentimplementation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private var navCon: NavController? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.homeFragmentButton.setOnClickListener {
            val name = binding.textInputField1.editText?.text.toString()
            val email = binding.textInputField2.editText?.text.toString()
            val institution = binding.textInputField1.editText?.text.toString()
            val bundle = Bundle()
            bundle.putString("name", name)
            bundle.putString("email", email)
            bundle.putString("institution", institution)
            //val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(name, email, institution)
            navCon?.navigate(R.id.action_homeFragment_to_detailsFragment, bundle)
        }
    }

}