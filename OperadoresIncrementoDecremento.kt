fun main(){

    var n:Int = 7

    n++ // n++ siginifica que o valor de n é acrescido por mais 1
    println("A variável tem o valor $n")

    n.inc() /* o n.inc() é realmente n + 1, porém o .inc() não altera a variável,
            é necessário fazer uma atribuição, ficando assim:
            n = n.inc()
            */
    println("A variável tem o valor de $n")

    // incremento n++ e ++n

  //  var x = 7
//    var y = ++x // o y receberá o x, mas antes será incrementado 1

 //   println("Os valores são $x e $y")


    var x = 7
    var y = x++ // o y receberá o x, e somente depois será incrementado 1

    println("Os valores são $x e $y")
}