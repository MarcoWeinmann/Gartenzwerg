package de.syntaxinstitut.gartenzwerg

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import de.syntaxinstitut.gartenzwerg.data.remote.Datasource
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import de.syntaxinstitut.gartenzwerg.data.remote.GemueseApi
import de.syntaxinstitut.gartenzwerg.data.remote.Repository
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = Repository(GemueseApi)


    val pflanzen: LiveData<List<Pflanzen>> = repository.pflanzenList

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            repository.getPflanzen()
        }
    }
}


