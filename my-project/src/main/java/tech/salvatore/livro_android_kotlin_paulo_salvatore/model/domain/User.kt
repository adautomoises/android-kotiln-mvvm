package tech.salvatore.livro_android_kotlin_paulo_salvatore.model.domain

data class User(
    val name: String,
    var hasCreatureAvaliable: Boolean,
    val creatures: MutableList<Creature> = mutableListOf()
)