package com.example.task2_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.textView)
        if (arguments?.getString("key") != null) {
            val bundle = arguments
            textView.text = bundle!!.getString("key")
        }

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val bundle = Bundle()
            val secondFragment = SecondFragment()

            bundle.putString("key", textView.text.toString())
            secondFragment.arguments = bundle
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.container, secondFragment)
                .commit()
        }
    }
}