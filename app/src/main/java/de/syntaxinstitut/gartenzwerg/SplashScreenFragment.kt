package de.syntaxinstitut.gartenzwerg

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class SplashScreenFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }

//    private fun splashAnimation(imageView: ImageView){
//        val rotator = ObjectAnimator.ofFloat(imageView, View.ROTATION_Y, 0f, 360f)
//        rotator.duration = 700
//
//
//        val set = AnimatorSet()
//        set.playTogether(rotator)
//        set.start()
//    }
}