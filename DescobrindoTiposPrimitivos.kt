fun main(){

    // Short
    println("Short:")
    println(Short.MAX_VALUE)
    println(Short.MIN_VALUE)
    println("---------------")

    // Int
    println("Int")
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
    println("---------------")

    // Foat
    println("Float")
    println(Float.MAX_VALUE)
    println(Float.MIN_VALUE)
    println("---------------")

    // Double
    println("Double")
    println(Double.MAX_VALUE)
    println(Double.MIN_VALUE)
    println("---------------")

    // Long
    println("Long")
    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)
    println("---------------")


    // Para strings utiliza o comando .length

    val tamanho:String = "Paula"
    println(tamanho.length)

 // Fazendo inferência de tipos
    var x:Int = 10

    var y = 20

    print(y is Int) //resultado True, o comando is é pra verificar se o objeto faz parte da classe.

    //Tipo Any

    var qualquer:Any
    qualquer = 20
    qualquer = "qualquer valor"

    

}

