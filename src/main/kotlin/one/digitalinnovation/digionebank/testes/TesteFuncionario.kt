package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Usuario
import java.math.BigDecimal

fun main(){
    val gabriela = Usuario(nome = " Gabriela Gama" , cpf = "1234567890")
    println(gabriela.nome)
    println(gabriela.cpf)

    val Alice = Funcionario(" Alice Gama" ,  "0987654321", BigDecimal.valueOf( 2000.0))
    println(Alice.nome)
    println(Alice.cpf)
    println(Alice.Salario)
}


//Updated bank test class