package com.carlos.task.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.carlos.task.R
import com.carlos.task.databinding.FragmentRecoverAccountBinding

class RecoverAccountFragment : Fragment() {

    private var _binding: FragmentRecoverAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        _binding = FragmentRecoverAccountBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

    private val nome: String = "teste000"

    // Parei no passo 31

    // teste do teste

}