fun main() {
    print("Digite um nome: ")
    val nome = readln()

    if (nome.isNotEmpty() && (nome[0] == 'A' || nome[0] == 'a')) {
        println(nome)
    }
}