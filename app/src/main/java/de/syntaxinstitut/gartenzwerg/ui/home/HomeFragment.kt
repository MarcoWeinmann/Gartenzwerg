package de.syntaxinstitut.gartenzwerg.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.databinding.FragmentHomeBinding
import de.syntaxinstitut.gartenzwerg.ui.signup.AuthViewModel

/**
 * Fragment 1
 */
class HomeFragment : Fragment(R.layout.fragment_home) {

    /* -------------------- Klassen Variablen -------------------- */

    /** Bindet das XML-View mit der Klasse um auf die Elemente zugreifen zu können */
    private lateinit var binding: FragmentHomeBinding

    /** Das ViewModel zu diesem Fragment */
    private val viewModel: HomeViewModel by viewModels()
    private val authviewmodel: AuthViewModel by viewModels()

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



        binding.buttonLogOut.setOnClickListener{
            authviewmodel.logout()

        }

        authviewmodel.currentUser.observe(
            viewLifecycleOwner,
            Observer{
                if (it == null) {
                    findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
            }
        )

        /* -------------------- UI-Interaktionen -------------------- */


        /* -------------------- Observer -------------------- */

        // Navigation zum zweiten Fragment



    }
}
