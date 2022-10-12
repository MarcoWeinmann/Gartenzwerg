package de.syntaxinstitut.gartenzwerg.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

    private lateinit var binding: FragmentHomeBinding

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

        //die Variable aus dem Viewmodel wird beobachtet
        viewModel.pflanzen.observe(
            viewLifecycleOwner,
            Observer {
                pflanzenAdapter.submitList(it)
            }
        )

        //Die Variable aus dem authViewmodel wird beobachtet
        // und wenn sie null ist wird man zum LoginFragment geleitet
        authviewmodel.currentUser.observe(
            viewLifecycleOwner,
            Observer {
                if (it == null) {
                    findNavController().navigate(R.id.loginFragment)
                }
            }
        )

        //bei klick auf den Logout button wird man ausgeloggt
        // und zum LoginFragment weitergeleitet
        binding.buttonLogOutHome.setOnClickListener {
            Toast.makeText(context, "Sie wurden erfolgreich ausgeloggt.", Toast.LENGTH_SHORT).show()
            authviewmodel.logout()
        }
    }
}

