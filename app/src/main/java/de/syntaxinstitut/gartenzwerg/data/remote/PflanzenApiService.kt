package de.syntaxinstitut.gartenzwerg.data.remote

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

//evtl "/" am ende der URL
const val BASE_URL = "https://public.syntax-institut.de/apps/batch2/MarcoW/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface PflanzenApiService {
    @GET("data.json")
    suspend fun getPflanzen(): List<Pflanzen>
}

object PflanzenApi {
    val retrofitService: PflanzenApiService by lazy { retrofit.create(PflanzenApiService::class.java) }
}