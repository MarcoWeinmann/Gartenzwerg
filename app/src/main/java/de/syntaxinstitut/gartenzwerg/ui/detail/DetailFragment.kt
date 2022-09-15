package de.syntaxinstitut.gartenzwerg.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    private var name = ""
    private var bild = 0
    private var text = ""

    private var saatStart: String = ""
    private var saatEnde: String = ""
    private var ernteStart: String = ""
    private var ernteEnde: String = ""
    private var pflanzenProQm: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       if (arguments != null) {
           name = arguments!!.getString("name").toString()
           text = arguments!!.getString("text").toString()
           bild = arguments!!.getInt("bild")

           saatStart = arguments!!.getInt("aussaatStart").toString()
           saatEnde = arguments!!.getInt("aussaatEnde").toString()
           ernteStart = arguments!!.getInt("ernteStart").toString()
           ernteEnde = arguments!!.getInt("ernteEnde").toString()
           pflanzenProQm = arguments!!.getInt("pflanzenProQm").toString()
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
        binding.tvDetailText.text = text
        binding.ivDetail.setImageResource(bild)
        binding.tvDetailName.text = name

        binding.tvDetailMeter.text = pflanzenProQm

        if (saatStart == saatEnde){
            binding.tvDetailAussaat.text = "$saatStart"
        }else{
            binding.tvDetailAussaat.text = "$saatStart-$saatEnde"
        }

        if (ernteStart == ernteEnde){
            binding.tvDetailErnte.text = "$ernteStart"
        }else{
            binding.tvDetailErnte.text = "$ernteStart-$ernteEnde"
        }



    }

}