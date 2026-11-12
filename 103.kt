fun main() {
    print("Entre com o ano atual: ")
    val anoAtual = readln().toInt()
    print("Entre com o ano de nascimento: ")
    val anoNasc = readln().toInt()

    if (anoNasc > anoAtual) {
        println("Ano de Nascimento Inválido")
    } else {
        println("Idade: ${anoAtual - anoNasc}")
    }
}