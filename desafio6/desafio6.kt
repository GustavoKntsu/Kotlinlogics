fun main() {
    print("Digite o nome do produto: ")
    val nomeProduto = readln()
    print("Digite o preço do produto: ")  
    val precoProduto = readln().toDouble()

    if (nomeProduto == "iMac" && precoProduto >= 10000) {
        val valorComDesconto = precoProduto - (precoProduto* 0.12)
        println("O produto $nomeProduto tem um desconto de 12% e o valor final é: R$ $valorComDesconto")
    }else {
        println("O produto $nomeProduto não tem desconto e o valor final é: R$ $precoProduto")
    }

}