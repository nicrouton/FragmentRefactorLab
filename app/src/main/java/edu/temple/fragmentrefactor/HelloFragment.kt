package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class HelloFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_hello, container, false)

        // declare variables for the views in the fragment
        val titleText = layout.findViewById<TextView>(R.id.displayTextView)
        val nameEditText = layout.findViewById<TextView>(R.id.nameEditText)
        val changeButton = layout.findViewById<Button>(R.id.changeButton)

        changeButton.setOnClickListener {
            val name = nameEditText.text

            titleText.text = if (name.isNotBlank()) {
                "Hello, $name!"
            } else {
                "Please enter your name"
            }

        }
        // return the layout
        return layout

    }
}