package com.fabioseyiji.views

class Formulario(
    val nome: String,
    val telefone: String,
    val email: String,
    val adicionaListaEmail: Boolean,
    val sexo: String,
    val cidade: String,
    val uf: String
) {
    override fun toString(): String {
        return """
        Nome: '$nome'
        Telefone: '$telefone'
        Email: '$email'
        Lista de emails: $adicionaListaEmail
        Sexo: '$sexo'
        Cidade: '$cidade'
        UF: '$uf'
    """.trimIndent()
    }
}