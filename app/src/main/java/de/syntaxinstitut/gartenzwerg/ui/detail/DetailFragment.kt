package de.syntaxinstitut.gartenzwerg.ui.detail

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.data.models.Datasource
import de.syntaxinstitut.gartenzwerg.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    private var name = ""
    private var bild = 0
    private var text = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       if (arguments != null) {
           name = arguments!!.getString("name").toString()
           text = arguments!!.getString("text").toString()
           bild = arguments!!.getInt("bild")
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

    }

}