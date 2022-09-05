package de.syntaxinstitut.gartenzwerg.ui.gemueseliste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.adapter.AdapterListe
import de.syntaxinstitut.gartenzwerg.data.models.Datasource
import de.syntaxinstitut.gartenzwerg.databinding.FragmentGemueseListeBinding

class GemueseListeFragment : Fragment() {

    private lateinit var binding: FragmentGemueseListeBinding

    

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_gemuese_liste, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val pflanzen = Datasource().loadGemüuse()

        binding.rvVeggie.adapter = AdapterListe(pflanzen)

        binding.rvVeggie.setHasFixedSize(true)
    }

}