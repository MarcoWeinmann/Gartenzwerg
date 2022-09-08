package de.syntaxinstitut.gartenzwerg.data.models

class Pflanzen (
    val name: String,
    val pictureResource: Int,
    val text: String,
    val id: Int,
    val aussaatZeitStart: Int,
    val aussaatZeitEnde: Int,
    val ernteZeitStart: Int,
    val ernteZeitEnde: Int,
    val pflanzenProQMeter: Int
    )