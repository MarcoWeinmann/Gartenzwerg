package de.syntaxinstitut.gartenzwerg.data.remote

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

// URL der API
const val BASE_URL = "https://public.syntax-institut.de/apps/batch2/MarcoW/"

// Moshi konvertiert Serverantworten in Kotlin Objekte
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

// Retrofit übernimmt die Kommunikation und übersetzt die Antwort
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

// Das Interface bestimmt, wie mit dem Server kommuniziert wird
interface PflanzenApiService {
    @GET("data.json")
    suspend fun getPflanzen(): List<Pflanzen>
}

// Das Objekt dient als Zugangspunkt für den Rest der App und stellt den API Service zur Verfügung
object PflanzenApi {
    val retrofitService: PflanzenApiService by lazy { retrofit.create(PflanzenApiService::class.java) }
}