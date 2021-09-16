package one.digitalinnovation.digionebank


class Usuario {
    var nome: String = "gabriela"  //Created a class person

    var cpf: String = "123.123.123.11"
        private set

    constructor()

    fun pessoaInfo() = "Usuario-$nome\nCPF-$cpf"
}

fun main(){
    val gabriela = Usuario()

    println(gabriela)
    println(gabriela.pessoaInfo())


}