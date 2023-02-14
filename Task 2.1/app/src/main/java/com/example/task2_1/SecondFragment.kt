package com.example.task2_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentTransaction


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editText = view.findViewById<EditText>(R.id.editText)
        val bundle = arguments

        editText.setText(bundle!!.getString("key"))

        val button = view.findViewById<Button>(R.id.button2)
        button.setOnClickListener {

            val fragment: Fragment = FirstFragment()
            val bundle = Bundle()
            bundle.putString("key", editText.text.toString())
            fragment.arguments = bundle
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.container, fragment)
                .commit()
        }

    }
}