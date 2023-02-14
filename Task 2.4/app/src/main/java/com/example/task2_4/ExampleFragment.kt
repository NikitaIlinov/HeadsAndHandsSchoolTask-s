package com.example.task2_4

import android.content.Context
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ExampleFragment : Fragment() {

    private lateinit var textViewFragment: TextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_example, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewFragment = view.findViewById(R.id.textViewFragment)
        textViewFragment.movementMethod = ScrollingMovementMethod()
        textViewFragment.append("\nonViewCreated")
        Log.i("Fragment", "onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        textViewFragment.append("\nonViewStateRestored")
        Log.i("Fragment", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        textViewFragment.append("\nonStart")
        Log.i("Fragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        textViewFragment.append("\nonResume")
        Log.i("Fragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        textViewFragment.append("\nonPause")
        Log.i("Fragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        textViewFragment.append("\nonStop")
        Log.i("Fragment", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        textViewFragment.append("\nonSaveInstanceState")
        Log.i("Fragment", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        textViewFragment.append("\nonDestroyView")
        Log.i("Fragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        textViewFragment.append("\nonDestroy")
        Log.i("Fragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        textViewFragment.append("\nonDetach")
        Log.i("Fragment", "onDetach")
    }
}

