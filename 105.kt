fun main() {
    print("Digite a sigla do estado: ")
    val sigla = readln().uppercase()

    when (sigla) {
        "RJ" -> println("Carioca")
        "SP" -> println("Paulista")
        "MG" -> println("Mineiro")
        else -> println("Outros estados")
    }
}