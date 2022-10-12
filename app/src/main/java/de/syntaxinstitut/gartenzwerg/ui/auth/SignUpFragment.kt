package de.syntaxinstitut.gartenzwerg.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private val viewModel: AuthViewModel by activityViewModels()

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflatet das Layout für dieses Fragment
      binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Leitet User zurück zu Login
        binding.buttonCancelSignUp.setOnClickListener{
            findNavController().navigateUp()
        }

        //Führt SignUp Funktion aus
        binding.buttonSignUp.setOnClickListener{
            signUp()
        }

        //beobachtet currentUser und wenn der User in Firebase registriert ist, wird er weitergeleitet zum HomeFragment
        viewModel.currentUser.observe(
            viewLifecycleOwner,
            Observer {

                if (it != null) {
                    findNavController().navigate(R.id.homeFragment)
                }
            }
        )

    }

    //Soll den User bei Firebase registrieren
    private fun signUp() {
        val email = binding.evEmail.text.toString()
        val password = binding.evPassword.text.toString()

        if (!email.isNullOrEmpty() && !password.isNullOrEmpty()) {
            viewModel.signUp(email, password)
        }
    }




}