package de.syntaxinstitut.gartenzwerg

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import de.syntaxinstitut.gartenzwerg.data.local.getDatabase
import de.syntaxinstitut.gartenzwerg.data.remote.Datasource
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import de.syntaxinstitut.gartenzwerg.data.remote.PflanzenApi
import de.syntaxinstitut.gartenzwerg.data.remote.Repository
import kotlinx.coroutines.launch

const val TAG = "MainViewModel"

enum class ApiStatus { LOADING, ERROR, DONE }

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val database = getDatabase(application)
    private val repository = Repository(PflanzenApi, database)



    val pflanzen: LiveData<List<Pflanzen>> = repository.pflanzenList

    private val _loading = MutableLiveData<ApiStatus>()
    val loading: LiveData<ApiStatus>
    get() = _loading


    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            _loading.value = ApiStatus.LOADING
            try {
                repository.getPflanzen()
                _loading.value = ApiStatus.DONE
            }catch (e: Exception) {
                Log.e(TAG, "Error loading Data $e")
                if (pflanzen.value.isNullOrEmpty()) {
                    _loading.value = ApiStatus.ERROR
                }else {
                    _loading.value = ApiStatus.DONE
                }
            }
        }
    }
}


