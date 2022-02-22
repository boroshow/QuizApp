package com.example.quizapp.ui.task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.databinding.FragmentTaskBinding

class TaskFragment : Fragment() {

    private lateinit var taskViewModel: TaskViewModel
    private var _binding: FragmentTaskBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        taskViewModel =
            ViewModelProvider(this).get(TaskViewModel::class.java)

        _binding = FragmentTaskBinding.inflate(inflater, container, false)
        val root: View = binding.root
        seekBar()
        return root
    }

    private fun seekBar() {
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                binding.amountTv.setText(binding.seekBar.progress.toString())
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                binding.amountTv.setText(binding.seekBar.progress.toString())
            }

        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}