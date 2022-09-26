package de.syntaxinstitut.gartenzwerg.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen


@Database(entities = [Pflanzen::class], version = 1)
abstract class PflanzenDatabase : RoomDatabase() {
    //verknüpft Database mit Dao Interface
    abstract val pflanzenDatabaseDao: PflanzenDatabaseDao
}
    //hier wird eine Instanz der Databsae gespeichert
    private lateinit var INSTANCE: PflanzenDatabase


    //Diese Funktion erstellt eine neue Database und liefert sie zurück,
    // falls noch keine Instanz der Database existiert

    fun getDatabase(context: Context): PflanzenDatabase {
        synchronized(PflanzenDatabase::class.java) {
            if (!::INSTANCE.isInitialized) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    PflanzenDatabase::class.java,
                    "pflanzen_deluxe_database"
                )
                    .build()
            }
        }
        return INSTANCE
    }