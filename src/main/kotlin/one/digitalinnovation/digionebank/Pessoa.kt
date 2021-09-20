package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "gabriel"  //Created a class person

    var cpf: String = "123.123.123.11"
        private set
}
   // inner class Endereco{
    //    var rua: String = "Rua Mavel"
  //  }
//}
fun main(){
    val gabriela = Pessoa()

    println(gabriela)
    println(gabriela.nome)
    println(gabriela.cpf)

    //println(gabriela.Endereco().rua)
}