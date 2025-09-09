package com.carlos.task.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.carlos.task.R
import com.carlos.task.databinding.FragmentFromTaskBinding
import com.carlos.task.util.initToolbar
import com.carlos.task.util.showBottomSheet

class FormTaskFragment : Fragment() {

    private var _binding: FragmentFromTaskBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFromTaskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar(binding.toolbar)
        initListener()
    }

    private fun initListener() {
        binding.buttonSave.setOnClickListener {
            validateData()
        }
    }

    private fun validateData() {
        val description = binding.editTextDescricao.text.toString().trim()
        if (description.isNotBlank()) {
            Toast.makeText(requireContext(), "Tudo OK!", Toast.LENGTH_SHORT).show()
        } else {
            showBottomSheet(message = getString(R.string.description_empty_form_task_fragment))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
