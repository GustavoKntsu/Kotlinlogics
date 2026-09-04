# Desafios Kotlin - Logica de Programacao

## Sobre o ambiente

Usei o VSCode em vez do IntelliJ IDEA por ser um editor mais leve para
diminuir a lentidão ao codar, ja que o IntelliJ consume muitos
recursos da maquina. Por isso, o Kotlin foi instalado via Scoop
(gerenciador de pacotes do Windows), reutilizando o JDK ja existente
na maquina.

## Como rodar

Cada desafio esta em um arquivo `.kt` separado, cada um com sua
propria funcao `main()`.

Pelo terminal:
kotlinc nomeDoArquivo.kt -include-runtime -d nomeDoArquivo.jar
java -jar nomeDoArquivo.jar


## Estrutura

- desafio1.kt - Comparacao de igualdade entre duas Strings
- desafioCNH/ - Desafios 2 a 5 (idade, condicoes de motorista)