package de.syntaxinstitut.gartenzwerg.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import de.syntaxinstitut.gartenzwerg.MainActivity
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.adapter.AdapterHome
import de.syntaxinstitut.gartenzwerg.databinding.FragmentHomeBinding
import de.syntaxinstitut.gartenzwerg.MainViewModel
import de.syntaxinstitut.gartenzwerg.ui.auth.AuthViewModel

class HomeFragment : Fragment() {


    /** Bindet das XML-View mit der Klasse um auf die Elemente zugreifen zu können */
    private lateinit var binding: FragmentHomeBinding

    /** Das ViewModel zu diesem Fragment */
    private val viewModel: MainViewModel by activityViewModels()
    private val authviewmodel: AuthViewModel by activityViewModels()


    /* -------------------- Lifecycle -------------------- */

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as MainActivity).showBottombar()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val pflanzenAdapter = AdapterHome()

        binding.rvVeggie.adapter = pflanzenAdapter

        viewModel.pflanzen.observe(
            viewLifecycleOwner,
            Observer {
                pflanzenAdapter.submitList(it)
              //  binding.rvVeggie.adapter = AdapterHome(it, requireContext())

            }
        )

        authviewmodel.currentUser.observe(
            viewLifecycleOwner,
            Observer {
                if (it == null) {
                    findNavController().navigate(R.id.loginFragment)
                }
            }
        )

        binding.buttonLogOutHome.setOnClickListener {
            authviewmodel.logout()
        }
    }
}

