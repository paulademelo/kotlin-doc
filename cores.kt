fun main(){
    val nasc = 1995
    val ano = 2021


    println("""
        <------------------------------>
        Olá! Tudo bem?
        Você nasceu em $nasc, certo?
        Atualmente estamos no ano de $ano.
        
        Calculando seus resultados...
        Terminei, pelos meus cálculos,
        você faz ${ano-nasc} anos até o final de $ano.
        <------------------------------>
    """)

    // UTILIZANDO CORES NO TERMIANAL

/*
* os códigos que estão em cinza é pq não foram utilizados no programa,
* é uma forma para descobrir e economizar espaços inutilizados na memória.
 */
    val RESET:String = "\u001B[00m"
    val PRETO:String = "\u001B[30m"
    val VERMELHO:String = "\u001B[31m"
    val VERDE:String = "\u001B[32m"
    val AMARELO:String = "\u001B[33m"
    val AZUL:String =  "\u001B[34m"
    val MAGENTA:String = "\u001B[35m"
    val CIANO:String = "\u001B[36m"
    val BRANCO:String = "\u001B[37m"

println("${VERMELHO}É ${AMARELO} um ${VERDE} prazer ${AZUL}conhecer ${CIANO} você! :D] ${RESET}")


    // outras formas de declarar as cores direto na linha de código
    println("\u001B[35m Rodrigo")
    println("\u001B[34m eu")
    println("\u001B[33m te")
    println("\u001B[32m AMOOO!")
    println("\u001B[31m <3")
}