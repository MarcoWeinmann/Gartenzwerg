package de.syntaxinstitut.gartenzwerg.ui.auth

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

const val TAG = "AUTHVIEWMODEL"

//Diese Klasse ist für die Authethication zuständig
class AuthViewModel (application: Application): AndroidViewModel(application) {

    private val firebaseAuth = FirebaseAuth.getInstance()

    //LiveData für den aktuellen User
    private val _currentUser = MutableLiveData<FirebaseUser?>(firebaseAuth.currentUser)
    val currentUser: LiveData<FirebaseUser?>
    get() = _currentUser

    //Soll den User über Firebase registrieren
    fun signUp(email: String, password: String) {
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
            if (it.isSuccessful) {
                login(email, password)
            }else{
                Log.e(TAG, "SingUp failed: ${it.exception}")
            }
        }
    }

    //Soll User einloggen
    fun login(email: String, password: String) {
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener{
            if (it.isSuccessful) {
                _currentUser.value = firebaseAuth.currentUser
            } else {
                Log.e(TAG, "Login failed: ${it.exception}")
            }
        }
    }

    //Soll User ausloggen
    fun logout() {
        firebaseAuth.signOut()
        _currentUser.value = firebaseAuth.currentUser
    }

}