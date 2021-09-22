package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
     nome: String, cpf: String,
    val Salario: BigDecimal) : Usuario(nome, cpf)
{
abstract fun calculoAuxilio();

}

