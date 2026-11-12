fun main() {
    print("Digite um número: ")
    val num = readln().toDouble()

    if (num > 20.0 && num < 90.0) {
        println("O número está na faixa de 20 a 90, exclusive")
    } else {
        println("O número está fora da faixa de 20 a 90")
    }
}