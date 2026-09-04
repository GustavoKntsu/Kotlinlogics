// Desafio 3 - Verificação de idade para dirigir, usando a negação da condição ('!', NOT)

fun main() {
    print("Digite sua idade: ")
    val idade = readln().toInt()

    if (!(idade >= 18)) {
        println("Voce NAO pode dirigir.")
    } else {
        println("Voce pode dirigir.")
    }
}