package de.syntaxinstitut.gartenzwerg.ui.kalender

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import de.syntaxinstitut.gartenzwerg.MainViewModel
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.databinding.FragmentKalenderBinding


class KalenderFragment : Fragment() {

    private lateinit var binding: FragmentKalenderBinding

    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
   /* //Dropdownmenu alt
    override fun onResume() {
        super.onResume()
        val gemuese = resources.getStringArray(R.array.Gemuese)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, gemuese)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }*/

    //Dropdownmenu
    override fun onResume() {
        super.onResume()
        viewModel.pflanzen.observe(
            viewLifecycleOwner
        ){
            val namen = mutableListOf<String>()
            for(pflanze in it){
                namen.add(pflanze.name)
            }
            val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, namen)
            binding.autoCompleteKalender.setAdapter(arrayAdapter)
            binding.autoCompleteKalender.text

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonKalenderAussaat.setOnClickListener{
            kalenderAussaat()
        }
    }
//Datasource?
    //buttons mit saatzeit verbinden
    private fun kalenderAussaat() {

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