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
        return "Formulario(name='$nome', telefone='$telefone', email='$email', adicionaListaEmail=$adicionaListaEmail, sexo='$sexo', cidade='$cidade', uf='$uf')"
    }
}