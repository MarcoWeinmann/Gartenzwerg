package de.syntaxinstitut.gartenzwerg.ui.beet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.databinding.FragmentBeetBinding

class BeetFragment : Fragment() {

    private lateinit var binding: FragmentBeetBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
    //Dropdownmenu
    override fun onResume() {
        super.onResume()
        val gemuese = resources.getStringArray(R.array.Gemuese)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, gemuese)
        binding.autoCompleteBeet.setAdapter(arrayAdapter)
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


}