package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val julian = Gerente(" Ana Julian" , "0987654321", 5000.0, "senha125")

    ImprimeRelatorioFuncionario.imprime(julian)

    TesteAutenticacao().autentica(julian)
}

