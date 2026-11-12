fun main() {
    print("Digite um número inteiro de 4 algarismos: ")
    val num = readln().toInt()

    val c = num / 100

    if (c % 4 == 0) {
        println("O número $c é múltiplo de 4.")
    } else {
        println("O número $c não é múltiplo de 4.")
    }
}