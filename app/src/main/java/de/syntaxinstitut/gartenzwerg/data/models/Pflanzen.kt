package de.syntaxinstitut.gartenzwerg.data.models

import com.squareup.moshi.Json

class Pflanzen (
    val name: String,
    @Json(name = "pictureResource")
    val imageResource: String,
    val text: String,
    val id: Int,
    val aussaatZeitStart: String,
    val aussaatZeitEnde: String,
    val ernteZeitStart: String,
    val ernteZeitEnde: String,
    val pflanzenProQMeter: Int,
    var clicked: Boolean = false
    )