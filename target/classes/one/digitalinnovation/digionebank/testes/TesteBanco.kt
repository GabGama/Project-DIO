package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {

    val digiOneBank = Banco(nome = "DigiOnex", numero = 123)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "BancoContax", numero = 145)

    println(banco2.info())
    //println(banco2.nome)
    //println(banco2.numero)
    //Updated bank test class
}