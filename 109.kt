fun main() {
    print("Digite o 1º nome: ")
    val nome1 = readln()
    print("Digite o 2º nome: ")
    val nome2 = readln()

    if (nome1 < nome2) {
        println("$nome1 $nome2")
    } else {
        println("$nome2 $nome1")
    }
}