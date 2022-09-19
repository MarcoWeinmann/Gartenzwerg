package de.syntaxinstitut.gartenzwerg.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.adapter.AdapterHome
import de.syntaxinstitut.gartenzwerg.data.Datasource
import de.syntaxinstitut.gartenzwerg.databinding.FragmentHomeBinding
import de.syntaxinstitut.gartenzwerg.MainViewModel
import de.syntaxinstitut.gartenzwerg.ui.login.LoginFragment
import de.syntaxinstitut.gartenzwerg.ui.signup.AuthViewModel

/**
 * Fragment 1
 */
class HomeFragment : Fragment() {

    /* -------------------- Klassen Variablen -------------------- */

    /** Bindet das XML-View mit der Klasse um auf die Elemente zugreifen zu können */
    private lateinit var binding: FragmentHomeBinding

    /** Das ViewModel zu diesem Fragment */
    private val viewModel: MainViewModel by activityViewModels()
    private val authviewmodel: AuthViewModel by activityViewModels()

    /* -------------------- Lifecycle -------------------- */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewModel.veggies.observe(
            viewLifecycleOwner,
            Observer {
                binding.rvVeggie.adapter = AdapterHome(it, requireContext())

                binding.rvVeggie.setHasFixedSize(true)
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


    /* -------------------- UI-Interaktionen -------------------- */


    /* -------------------- Observer -------------------- */

    // Navigation zum zweiten Fragment


}

