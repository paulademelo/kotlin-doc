/*
Como fazer a entrada de dados pelo usuário com validação de tipos
 */
fun main(){
    // o readline() é o comando para receber as entradas de dados
    println("Qual é o seu nome")
    val nome:String = readLine()!!
    //caso o valor seja nulo, será disparado o NPE(null pointer exception) por causa dos !! após o readLine

    println("Qual a sua idade $nome ?")
    val idade:Int = readLine()!!.toIntOrNull()?:0
    //converte a entrada de dados para Int
    // se o usuário digitar um valor nulo, o comando .toIntOrNull():?0 atribuirá o valor digitado como 0.

    println("$nome tem $idade  anos")
    println("É um prazer te conhecer $nome :D")

    // fazendo operações com entrada de dados
    println("Digite um número: ")
    val numero:Int = readLine()!!.toIntOrNull()?:0

    println("Digite o segundo número para fazer o cáculo de soma:")
    val numero2:Int = readLine()!!.toIntOrNull()?:0

    val soma:Int = numero.plus(numero2)

    print("A soma de $numero + $numero2 é de = $soma")
    }