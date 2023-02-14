package com.example.task2_2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class NumberFragment : Fragment(R.layout.fragment_number) {
    companion object {

        fun newInstance(text: String) =
            NumberFragment().apply {
                arguments = Bundle().apply {
                    putString("key", text)
                }
            }
    }

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.text = arguments?.getString("key") ?: ""
    }
}