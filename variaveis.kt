/*
* Declarando variáveis
 */

fun main(args: Array<String>){
    //Exemplo de variáveis

    var nome:String = "Paula"
    var idade:Short = 25 // até 32.000 se colocar 33.000 o short irá ter erro
    var peso:Float = 879F
    var cpf:Long = 5_000_000L //o _ dentro dos números é apenas para os programadores verificarem quantos 0 tem o num.


    // declaração de constantes
    val nome1: String = "Rodrigo"
    val idade1:Short = 38
    val peso1:Float = 98F
    val cpf1:Long = 100_000_000L

    // exemplo de manipulação de variáveis:

    var n1:Int = 7
    var n2:Int

    n2 = n1 //n2 recebe o mesmo valor de n1, ele PRECISA ser do mesmo tipo que o n1.

    println(n2)
    println(n1)

    // Como fazer a conversão de tipos:

    val n3:Float = 21.9F
    val n4:Double = n3.toDouble()

    println(n4)

}