// Desafio 5 - Verificação de condições para dirigir, usando a condição "E" (AND)

fun main() {
    print("Voce e motorista? (S/N): ")
    val resposta = readln()
    val motorista = resposta.equals("S", ignoreCase = true)

    print("Digite sua idade: ")
    val idade = readln().toInt()

    if (motorista && idade > 30) {
        println("Condicao atendida.")
    } else {
        println("Condicao nao atendida.")
    }
}