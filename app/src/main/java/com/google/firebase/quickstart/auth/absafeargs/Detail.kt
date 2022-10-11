package com.google.firebase.quickstart.auth.absafeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.firebase.quickstart.auth.absafeargs.databinding.FragmentDetailBinding


class Detail : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    // get the arguments from the Registration fragment
    private val args : DetailArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        // Receive the arguments in a variable
        val userDetail = args.user

        // set the values to respective textViews
        binding.tvName.text = userDetail.name
        binding.tvEmail.text = userDetail.email
        binding.tvPassword.text = userDetail.password

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
