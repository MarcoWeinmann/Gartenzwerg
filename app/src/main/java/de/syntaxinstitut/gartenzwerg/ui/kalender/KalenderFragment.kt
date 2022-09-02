package de.syntaxinstitut.gartenzwerg.ui.kalender

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.databinding.FragmentKalenderBinding


class KalenderFragment : Fragment() {

        private lateinit var binding: FragmentKalenderBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
        //Dropdownmenu
    override fun onResume() {
        super.onResume()
        val gemuese = resources.getStringArray(R.array.Gemuese)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, gemuese)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentKalenderBinding.inflate(inflater, container, false)



        // Inflate the layout for this fragment
        return binding.root
    }

}