package de.syntaxinstitut.gartenzwerg.data.models

class Pflanzen (
    val name: String,
    val pictureResource: Int,
    val text: String,
    val id: Int,
    val aussaat: List<IntRange>
    )