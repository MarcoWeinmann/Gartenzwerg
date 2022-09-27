package de.syntaxinstitut.gartenzwerg.data.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import de.syntaxinstitut.gartenzwerg.TAG
import de.syntaxinstitut.gartenzwerg.data.local.PflanzenDatabase
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository(private val pflanzenApi: PflanzenApi, private val database: PflanzenDatabase) {


    val pflanzenList: LiveData<List<Pflanzen>> = database.pflanzenDatabaseDao.getAll()

  /*  private val _pflanzenList = MutableLiveData<List<Pflanzen>>()
    val pflanzenList: LiveData<List<Pflanzen>>
    get() = _pflanzenList*/

    suspend fun getPflanzen() {
        withContext(Dispatchers.IO) {
            val newPflanzenList = pflanzenApi.retrofitService.getPflanzen()
            database.pflanzenDatabaseDao.insertAll(newPflanzenList)
        }
    }

    suspend fun deleteAll() {
        try {
        //    database.pflanzenDatabaseDao.deleteAll()
        }catch (e: Exception) {
            Log.d(TAG, "Failed to delete the Database: $e")
        }
    }
}