package de.syntaxinstitut.gartenzwerg.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import de.syntaxinstitut.gartenzwerg.MainViewModel
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.databinding.FragmentBeetBinding

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

        }
    }


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
        binding.buttonBeetErstellen.setOnClickListener {
            if (binding.autoCompleteBeet.text.toString() != "Gemüse-Sorten") {

                val pflanzenString = binding.autoCompleteBeet.text
                viewModel.aktuellePflanze =
                    viewModel.pflanzen.value?.find { it.name == pflanzenString.toString() }!!
                val breite = binding.evBeetBreite.text.toString()
                val laenge = binding.evBeetLaenge.text.toString()
                if (breite.isNotEmpty() || laenge.isNotEmpty()) {

                    val ergebnis = viewModel.pflanzenRechner(
                        laenge.toDouble(),
                        breite.toDouble(),
                        viewModel.aktuellePflanze.pflanzenProQMeter
                    )
                    binding.tvErgebniss.text = ergebnis.toString()
                }else {
                    Toast.makeText(context, "Gebe Länge und Breite deines Beets ein.", Toast.LENGTH_SHORT).show()
                }

            }else {
                Toast.makeText(context, "Wähle zuerst eine Gemüsesorte aus!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}