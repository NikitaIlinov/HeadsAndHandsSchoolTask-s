package com.example.task2_3

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class ResultFragment : Fragment(R.layout.fragment_result) {

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.text = arguments?.getString("key") ?: ""
    }

    companion object {

        fun newInstance(text: String) =
            ResultFragment().apply {
                arguments = Bundle().apply {
                    putString("key", text)
                }
            }
    }
}