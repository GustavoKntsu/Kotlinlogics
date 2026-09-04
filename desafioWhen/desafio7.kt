fun main() {
    print("Digite qual o dia da semana (SEG, TER, QUA, QUI, SEX, SAB, DOM): ")
    val diaSemana = readln().uppercase()

    when (diaSemana) {
        "SAB", "DOM" -> println("E final de semana, descanse")
        "SEG", "TER", "QUA", "QUI", "SEX" -> println("E dia util, trabalha!")
        else -> println("Dia da semana invalido, digite novamente!")
    }
}