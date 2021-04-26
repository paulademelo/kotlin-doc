# Módulo 01 - Estruturas básicas

- E/S
- Tipos
- Variáveis
- Constantes
- Operadores

  ### :printer: Mostrando coisas na tela com Kotlin

Mostrar "Olá mundo!"

```
fun main() {
    println("Olá Mundo!")
}
```

Comandos para utilizar no kotlin:

- \n = nova linha
- \t = tabulação
- \b backspace
- \r = retorno (sobrepõe a palavra anterior e mostra o próximo)
- \ \ = barra (mostra uma barra)
- " = aspas delimita a string no Kotlin

Como escrever as aspas na tela?

- ```
  fun main() {
      println("Kotlin é \n\"SUPER \"\n Fácil!")
  
  }
  ```

A mensagem que será mostrada é:

​	Kotlin é

​	"SUPER"

​	fácil!



## :pencil: Como fazer comentários

// = comentário de uma linha

/* = comentário com múltiplas linhas (finaliza com */)

/** = KDoc usado para comentários em forma de documentação. Utilizados na documentação do sistema.



## :package: Tipos primitivos



- Os tipos primitivos no kotlin são Classe, a primeira letra dos tipos serão em maiúsculas

  - Int - inteiro

    - Byte (para números menores de 128, ex: idade)
    - Short (de menos 32 mil até mais 32 mil)
    - Int (2 elevado a 32 em diante)
    - Long (passa do quintilhão)

    

  - Char - caracter

    - String (cadeia de caracteres)
    - Char

  - Float -  São números reais, o que diferencia são a quantidade de números após a vírgula

    - Float
    - Double (o dobro de números que o float)

    

  - Boolean - é o tipo lógico, verdadeiro ou falso.

#### :dart: Em kotlin, tudo é objeto.



#### Variáveis

var idade:Short = 19

var nome:String = "Zé"

var casado:Boolean = "false"

var media:Float = "9.5f" // o f significa que são do tipo float



#### Regras do Kotlin sobre as variáveis

- começa com uma letra ou sublinhado
- Maiúsculas e minúsculas fazem a diferença
- Só usa letras, números e sublinhado
- Podemos usar acentos
- Não pode conter espaços
- Não pode ter símbolos (só o sublinhado)
- Não pode ser uma palavra reservada (ex: print, fun etc.)



#### Relação entre variável e constante

:alarm_clock: Var = Variável: o valor varia de acordo com a execução do programa

:anchor: Val = Constante: o valor permanecerá o mesmo no programa.



```
// declaração de constantes
val nome1: String = "Rodrigo"
val idade1:Short = 38
val peso1:Float = 98F
val cpf1:Long = 100_000_000L
```



```
// declaração de Variáveis
var nome:String = "Paula"
var idade:Short = 25 // até 32.000 se colocar 33.000 o short irá ter erro
var peso:Float = 879F
var cpf:Long = 5_000_000L //o _ dentro dos números é apenas para os programadores verificarem quantos 0 tem o num.
```



### Analisando os tipos

como descobrir os valores dos tipos primitivos

```

- Para números
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
```

Resultado que será mostrado na tela:

Short:
32767

-32768
---------------
Int
2147483647
-2147483648
---------------
Float
3.4028235E38
1.4E-45
---------------
Double 
1.7976931348623157E308  Valor maior

4.9E-324  Valor menor
---------------
Long
9223372036854775807  Valor maior

-9223372036854775808 Valor menor
---------------



:heavy_exclamation_mark: Para saber o tamanho da string:

```
// Para strings utiliza o comando .length

val tamanho:String = "Paula"
println(tamanho.length)
```

resultado: 5 (ocupa 5 bytes na memória)



### Como fazer inferência de tipo



var x:Int = 10

var y = 20

print(y is Int)



### Tipo Any

É diferente da inferência de dados. Esse comando aceita que a variável será de qualquer tipo (menos o null).

O any é o tipo primitivo para generalizar.





# :exclamation:	Nulo em Kotlin



 O valor nulo é um grande problema na maioria das linguagens, o valor nulo não é a mesma coisa que vazio nem zero. O kotlin possui um conceito chamado Null Safety, que significa que se você não fizer nada, nenhuma variável aceitará o Null.

Existem 3 operadores para fazer o tratamento do Nul

- ? = Safe Call, utilizado quando o tipo primitivo pode ser um valor do tipo primitivo ou pode ser nulo.

  - ex: val nome:String?

    nome = null

    

- ?: = elvis operator

  - ex:

    var a:Int?

    var b:Int 

    a = 8

    b = a:?0 	**//o b recebe o a, se por acaso o a for null, coloca o 0.**

    nesse caso o b será 8.

  

- !! = Null check,  diferente do elvis, que podemos colocar um valor caso seja nulo, no Null Check vai disparar uma exceção chamada npe (null pointer exception) para o tratamento de erros. A exceção pode ser tratada.

  - ex:

    var a:Int?

    var b:Int 

    a = null

    b = a!!

    //não terá erro, porém no print da tela dará a seguinte mensagem:

    // Exception in thread "" kotlin.Kotlin **Null Pointer Exception**

    

    

    



