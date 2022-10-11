package de.syntaxinstitut.gartenzwerg

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import de.syntaxinstitut.gartenzwerg.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : Fragment() {

    lateinit var binding: FragmentSplashScreenBinding

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as MainActivity).hideBottombar()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        splashAnimation(binding.ivSplash)
        fadeAnimation()
        Handler().postDelayed({

            findNavController().navigate(SplashScreenFragmentDirections.actionSplashScreenFragmentToLoginFragment())
        }, 3000)
    }

    private fun splashAnimation(imageView: ImageView){
        val rotator = ObjectAnimator.ofFloat(imageView, View.ROTATION_Y, 0f, 360f)
        rotator.duration = 1900

        val set = AnimatorSet()
        set.playTogether(rotator)
        set.start()
    }

    private fun fadeAnimation(){
        val animator = ObjectAnimator.ofFloat(binding.ivSplash, View.ALPHA, 0f)
        animator.duration = 2500
        animator.start()
    }
}