package de.syntaxinstitut.gartenzwerg.data.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import de.syntaxinstitut.gartenzwerg.TAG
import de.syntaxinstitut.gartenzwerg.data.local.PflanzenDatabase
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

//Diese Klasse holt die Informationen und stellt sie mithilfe von Live Data dem Rest
//der App zur Verfügung

class Repository(private val pflanzenApi: PflanzenApi, private val database: PflanzenDatabase) {


    val pflanzenList: LiveData<List<Pflanzen>> = database.pflanzenDatabaseDao.getAll()


    //Diese Funktion ruft die Daten aus dem API Service in einer Coroutine ab und speichert die
    //Antwort in der Datenbank
    suspend fun getPflanzen() {
        withContext(Dispatchers.IO) {
            val newPflanzenList = pflanzenApi.retrofitService.getPflanzen()
            database.pflanzenDatabaseDao.insertAll(newPflanzenList)
        }
    }
    //Diese Funktion versucht mittels der delete Funktion des DAO eine Pflanze zu löschen
    suspend fun deleteAll() {
        try {
        //    database.pflanzenDatabaseDao.deleteAll()
        }catch (e: Exception) {
            Log.d(TAG, "Failed to delete the Database: $e")
        }
    }
}