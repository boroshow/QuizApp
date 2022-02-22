package com.example.quizapp.ui.task.main_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.quizapp.R

class MainTaskFragment : Fragment() {

    lateinit var button : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_task, container, false)
        button = view?.findViewById(R.id.search_close_bt)!!
    }

}