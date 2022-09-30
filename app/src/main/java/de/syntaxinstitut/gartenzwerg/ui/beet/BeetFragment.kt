package de.syntaxinstitut.gartenzwerg.ui.beet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import de.syntaxinstitut.gartenzwerg.MainViewModel
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import de.syntaxinstitut.gartenzwerg.databinding.FragmentBeetBinding
import java.lang.Double.parseDouble

class BeetFragment : Fragment() {

    private lateinit var binding: FragmentBeetBinding

    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
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
            binding.autoCompleteBeet.setAdapter(arrayAdapter)
            binding.autoCompleteBeet.text
           // viewModel.currentPflanze.value = arrayAdapter.getPosition()

            //brauche currentPflanze für beet Rechnung (am besten mutableLivedata)
        }
    }

/*    val spinner: Spinner = findViewById(R.id.spinner)
// Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter.createFromResource(
    this,
    R.array.planets_array,
    android.R.layout.simple_spinner_item
    ).also { adapter ->
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        spinner.adapter = adapter
    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBeetBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBeetErstellen.setOnClickListener{
            val pflanzenString = binding.autoCompleteBeet.text
            viewModel.aktuellePflanze = viewModel.pflanzen.value?.find { it.name == pflanzenString.toString() }!!
            val breite = binding.evBeetBreite.text.toString()
            val laenge = binding.evBeetLaenge.text.toString()
            if (breite != null || laenge != null){

                val ergebnis = viewModel.pflanzenRechner(laenge.toDouble(), breite.toDouble(), viewModel.aktuellePflanze.pflanzenProQMeter)
                binding.tvErgebniss.text = ergebnis.toString()
            }
        }
    }
}