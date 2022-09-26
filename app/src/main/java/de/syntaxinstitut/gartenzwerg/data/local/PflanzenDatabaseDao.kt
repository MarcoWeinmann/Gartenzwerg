package de.syntaxinstitut.gartenzwerg.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen


@Dao
interface PflanzenDatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(pflanzen: List<Pflanzen>)

    @Query("SELECT * from Pflanzen")
    fun getAll(): LiveData<List<Pflanzen>>

    @Query("DELETE from Pflanzen")
    suspend fun deleteAll()

}