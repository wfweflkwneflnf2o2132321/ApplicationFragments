package com.example.applicationfragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment: Fragment(R.layout.fragment_second) {

    companion object{
        fun newInstance (arg: Bundle?): SecondFragment {
            val fragment = SecondFragment()
            fragment.arguments = arg
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val one = requireActivity().findViewById<TextView>(R.id.one)
        val two = requireActivity().findViewById<TextView>(R.id.two)
        val three = requireActivity().findViewById<TextView>(R.id.three)
        val clear = requireActivity().findViewById<Button>(R.id.clear)


        val ttH = requireActivity().findViewById<TextView>(R.id.ttH)

        one.text = arguments?.getString("name")
        two.text = arguments?.getString("surname")
        three.text = arguments?.getString("email")



        ttH.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(android.R.id.content, MainFragment())
                .commit()
        }

        clear.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(android.R.id.content, MainFragment())
                .commit()
        }

    }
}




