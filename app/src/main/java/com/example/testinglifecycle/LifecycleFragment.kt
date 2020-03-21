package com.example.testinglifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 */
class LifecycleFragment : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d("1234", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("1234", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("1234", "onCreateView")
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("1234", "onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("1234", "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("1234", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("1234", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("1234", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("1234", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("1234", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("1234", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("1234", "onDetach")
    }
}
