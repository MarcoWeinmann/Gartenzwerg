package de.syntaxinstitut.gartenzwerg.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import de.syntaxinstitut.gartenzwerg.MainViewModel
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.databinding.FragmentKalenderBinding


class KalenderFragment : Fragment() {

    private lateinit var binding: FragmentKalenderBinding

    private val viewModel: MainViewModel by activityViewModels()

   private val buttonList = mutableListOf<Button>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    //Dropdownmenu
    override fun onResume() {
        super.onResume()
        viewModel.pflanzen.observe(
            viewLifecycleOwner
        ) {
            val namen = mutableListOf<String>()
            for (pflanze in it) {
                namen.add(pflanze.name)
            }
            val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, namen)
            binding.autoCompleteKalender.setAdapter(arrayAdapter)

            binding.autoCompleteKalender.onItemClickListener =
                AdapterView.OnItemClickListener { adapter, view, position, arg ->
                    kalenderReset(buttonList)
                }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonKalenderAussaat.setOnClickListener {
            kalenderAussaat()
        }
        binding.buttonKalenderErnte.setOnClickListener {
            kalenderErnte()
        }

        //erstellt Liste von Buttons/Monate und greift auf buttons zu

        buttonList.add(binding.bJan)
        buttonList.add(binding.bFeb)
        buttonList.add(binding.bMar)
        buttonList.add(binding.bApr)
        buttonList.add(binding.bMai)
        buttonList.add(binding.bJun)
        buttonList.add(binding.bJul)
        buttonList.add(binding.bAug)
        buttonList.add(binding.bSep)
        buttonList.add(binding.bOkt)
        buttonList.add(binding.bNov)
        buttonList.add(binding.bDez)

        kalenderReset(buttonList)
    }

    //zeigt Aussaat_Monate Grün an
    private fun kalenderAussaat() {
        //string zu int
        if (binding.autoCompleteKalender.text.toString() != "Gemüse-Sorten") {


            viewModel.aktuellePflanze = viewModel.pflanzen.value?.find {
                it.name == binding.autoCompleteKalender.text
                    .toString()
            }!!

            val aussaatstart = viewModel.aktuellePflanze.aussaatZeitStart.toInt()
            val aussaatende = viewModel.aktuellePflanze.aussaatZeitEnde.toInt()


            kalenderReset(buttonList)

            //geht durch aussaatstart und aussaatende (Api)
            for (i in aussaatstart - 1..aussaatende - 1) {
                //ändert die Farben der Buttons/Monate
                buttonList[i].setBackgroundColor(resources.getColor(R.color.clickedGreen))
            }
        } else {
            Toast.makeText(context, "Wähle zuerst eine Gemüsesorte aus!", Toast.LENGTH_SHORT).show()
        }
    }

    //zeigt Ernte_Monate Orange an
    private fun kalenderErnte() {
        if (binding.autoCompleteKalender.text.toString() != "Gemüse-Sorten") {

                viewModel.aktuellePflanze = viewModel.pflanzen.value?.find {
                    it.name == binding.autoCompleteKalender.text
                        .toString()
                }!!
                val ernteStart = viewModel.aktuellePflanze.ernteZeitStart.toInt()
                val ernteEnde = viewModel.aktuellePflanze.ernteZeitEnde.toInt()


                kalenderReset(buttonList)

                //geht durch aussaatstart und aussaatende (Api)
                for (i in ernteStart - 1..ernteEnde - 1) {
                    //ändert die Farben der Buttons/Monate
                    buttonList[i].setBackgroundColor(resources.getColor(R.color.orange))
                }
            } else {
                Toast.makeText(context, "Wähle zuerst eine Gemüsesorte aus!", Toast.LENGTH_SHORT)
                    .show()
            }
    }

    //setzt Farben zurück auf Blau
    fun kalenderReset(buttonList: MutableList<Button>) {
        for (button in buttonList) {
            button.setBackgroundColor(resources.getColor(R.color.kalenderblau))
        }
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