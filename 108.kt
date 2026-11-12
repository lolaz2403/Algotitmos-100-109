fun main() {
    print("Digite um nome: ")
    val nome = readln()

    if (nome.startsWith("JOSÉ ", ignoreCase = true) ||
        nome.equals("JOSÉ", ignoreCase = true) ||
        nome.equals("JOSE", ignoreCase = true)) {
        println(nome)
    }
}