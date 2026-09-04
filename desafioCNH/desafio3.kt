fun main() {
    print("Digite sua idade: ")
    val idade = readln().toInt()

    if (!(idade >= 18)) {
        println("Voce NAO pode dirigir.")
    } else {
        println("Voce pode dirigir.")
    }
}