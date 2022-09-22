package de.syntaxinstitut.gartenzwerg.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import de.syntaxinstitut.gartenzwerg.MainViewModel
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    private val viewmodel: MainViewModel by activityViewModels()

    private var veggieId = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

           veggieId = it.getInt("id")


       }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)

        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewmodel.pflanzen.observe(
            viewLifecycleOwner,
            Observer {list ->
                val pflanzen = list.find {
                    it.id == veggieId
                }
                if (pflanzen != null){
                    binding.tvDetailText.text = pflanzen.text
                    binding.tvDetailName.text = pflanzen.name
                    binding.tvDetailMeter.text = pflanzen.pflanzenProQMeter.toString()


                    if (pflanzen.aussaatZeitStart == pflanzen.aussaatZeitEnde){
                        binding.tvDetailAussaat.text = "${pflanzen.aussaatZeitStart}"
                    }else{
                        binding.tvDetailAussaat.text = "${pflanzen.aussaatZeitStart}-${pflanzen.aussaatZeitEnde}"
                    }

                    if (pflanzen.ernteZeitStart == pflanzen.ernteZeitEnde){
                        binding.tvDetailErnte.text = "${pflanzen.ernteZeitStart}"
                    }else{
                        binding.tvDetailErnte.text = "${pflanzen.ernteZeitStart}-${pflanzen.ernteZeitEnde}"
                    }
                }


            }
        )






    }

}