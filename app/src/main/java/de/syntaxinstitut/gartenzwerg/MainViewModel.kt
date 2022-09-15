package de.syntaxinstitut.gartenzwerg

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import de.syntaxinstitut.gartenzwerg.data.Datasource
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen

/**
 * Das ViewModel des One Fragments
 */
class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = Datasource()

    private val _veggies = MutableLiveData<List<Pflanzen>>()
    val veggies: LiveData<List<Pflanzen>>
    get() = _veggies

    init {
        _veggies.value = repository.loadGemüuse()
    }
}


