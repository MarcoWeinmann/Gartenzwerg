package de.syntaxinstitut.gartenzwerg.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity
data class Pflanzen (

    //PrimaryKey besagt: Die nachfolgende Variable dient als Schlüssel
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    @Json(name = "pictureResource")
    val imageResource: String,
    val text: String,
    val aussaatZeitStart: String,
    val aussaatZeitEnde: String,
    val ernteZeitStart: String,
    val ernteZeitEnde: String,
    val pflanzenProQMeter: Int,
    var clicked: Boolean = false
    )