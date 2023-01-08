package com.example.applicationfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment: Fragment (R.layout.fragment_main) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "onViewCreated")

        val tvName = requireActivity().findViewById<EditText>(R.id.tvName)
        val tvSurname = requireActivity().findViewById<EditText>(R.id.tvSurname)
        val tvEmail = requireActivity().findViewById<EditText>(R.id.tvEmail)
        val tvButton = requireActivity().findViewById<Button>(R.id.tvButton)

        val tvHello = requireActivity().findViewById<TextView>(R.id.tvHello)

        tvHello.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(android.R.id.content, SecondFragment())
                .commit()
        }

        tvButton.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", tvName.text.toString())
            bundle.putString("surname", tvSurname.text.toString())
            bundle.putString("email", tvEmail.text.toString())
            parentFragmentManager.beginTransaction().replace(android.R.id.content, SecondFragment.newInstance(bundle))
                .commit()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TAG", "onAttach")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG", "onDestroyView")
    }


    override fun onDetach() {
        super.onDetach()
        Log.d("TAG", "onDetach")
    }





}