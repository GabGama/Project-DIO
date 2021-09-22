package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Funcionario(
     nome: String, cpf: String,
    val Salario: BigDecimal) : Usuario(nome, cpf)
{

}

