import kotlin.math.* // o * importa tudo que tem na biblioteca, não é recomendado pq usa memória.

fun main(){
    val n1:Int = 5
    val n2:Int = 2

    println("Calculando a Soma:")
    println("$n1 + $n2 = ${n1 + n2}")
    println( println("$n1 + $n2 = ${n1.plus(n2)}"))
    println("------------------------")

    println("Calculando a Subtração:")
    println("$n1 - $n2 = ${n1 - n2}")
    println( println("$n1 - $n2 = ${n1.minus(n2)}")) //

    println("------------------------")

    println("Calculando a Multiplicação:")
    println("$n1 * $n2 = ${n1 * n2}")
    println( println("$n1 * $n2 = ${n1.times(n2)}"))

    println("------------------------")

    println("Calculando a Divisão:")
    println("$n1 / $n2 = ${n1.toFloat() / n2}") // a divisão funciona como inteiro ou real
    // para que seja mostrado os números após a vírgula, é necessário fazer a conversão em um dos números
    println(println("$n1 / $n2 = ${n1.div(n2.toFloat())}"))

    println("------------------------")

    println("Calculando o Resto:")
    println("$n1 % $n2 = ${n1 % n2}")
    println( println("$n1 % $n2 = ${n1.rem(n2)}"))

    println("Raíz quadrada: ${sqrt(25f)} ")
    println("Potência: ${7f.pow(2)}")
    println("Arredonda para cima: ${ceil(8.12f)}")
    println("Arredonda: ${8.49f.roundToInt()}")
    println("Arredonda para baixo: ${ floor(8.8)}")
    println("Maior: ${max(7 , 12)}")
    println("Menor: ${min(2 , 1)}")
}