// Desafio 2 - Verificação de idade para dirigir
fun main() {

    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()
    
    if(idade >= 18) {
        println("Voce tem mais 18 anos, pode dirigir.")        
    } else{
        println("Voce tem menos de 18 anos, não pode dirigir.")
    }

} 