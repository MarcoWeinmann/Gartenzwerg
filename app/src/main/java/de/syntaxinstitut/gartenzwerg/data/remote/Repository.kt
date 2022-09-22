package de.syntaxinstitut.gartenzwerg.data.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen

class Repository(private val pflanzenApi: GemueseApi) {

    private val _pflanzenList = MutableLiveData<List<Pflanzen>>()
    val pflanzenList: LiveData<List<Pflanzen>>
    get() = _pflanzenList

    suspend fun getPflanzen() {
        _pflanzenList.value = pflanzenApi.retrofitService.getGemuese()
    }
}