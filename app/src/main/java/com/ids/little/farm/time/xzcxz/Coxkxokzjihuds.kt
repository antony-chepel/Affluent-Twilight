package com.ids.little.farm.time.xzcxz
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ids.little.farm.time.R
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater



class Coxkxokzjihuds : Fragment() {
    private lateinit var juxyuyggyc: Context

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.appowiwhjue, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        juxyuyggyc=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        findNavController().navigate(R.id.wiwijeuhshud)

    }


}