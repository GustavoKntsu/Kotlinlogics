fun main() {
    print("Voce e motorista? (S/N): ")
    val resposta = readln()
    val motorista = resposta.equals("S", ignoreCase = true)
    
    print("Digite sua idade: ")
    val idade = readln().toInt()

    if (motorista || idade >= 17) {
        println("Condicao atendida.")
    } else {
        println("Condicao nao atendida.")
    }
}