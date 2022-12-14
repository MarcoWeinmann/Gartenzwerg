package de.syntaxinstitut.gartenzwerg.ui.auth

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
import de.syntaxinstitut.gartenzwerg.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    private val viewmodel: AuthViewModel by activityViewModels()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as MainActivity).hideBottombar()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflatet das Layout für diese Klasse
  binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //User wird zu SignUp Fragment weitergeleitet
        binding.SignUpButton1.setOnClickListener{
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignUpFragment())
        }

        //User wird eingeloggt
        binding.buttonLogin.setOnClickListener{
            val email = binding.evEmailLogin.text.toString()
            val password = binding.evPasswordLogin.text.toString()

            if (!email.isNullOrEmpty() && !password.isNullOrEmpty()) {
                viewmodel.login(email, password)
            }
        }

        //beobachtet currentUser und wenn der User in Firebase registriert ist, wird er weitergeleitet zum HomeFragment
        viewmodel.currentUser.observe(
            viewLifecycleOwner,
            Observer {
                if (it != null) {
                    findNavController().navigate(R.id.homeFragment)
                }
            }
        )


    }


}