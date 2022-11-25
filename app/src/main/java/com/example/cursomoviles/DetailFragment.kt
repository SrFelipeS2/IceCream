package com.example.cursomoviles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.cursomoviles.R

class DetailFragment : Fragment (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmento = inflater.inflate(R.layout.fragment_detail,container,false)


        var tarea = requireArguments().getString("titles")
        var hora = requireArguments().getString("times")
        var lugar = requireArguments().getString("places")

        var textViewTarea:  TextView = fragmento.findViewById(R.id.textViewThank_you)
        var textViewHora:  TextView = fragmento.findViewById(R.id.textViewTotal_Sale)
        var textViewLugar:  TextView = fragmento.findViewById(R.id.textViewCome_Back)

        textViewTarea.text = tarea
        textViewHora.text = hora
        textViewLugar.text = lugar

        return fragmento



    }
}