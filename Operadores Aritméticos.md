## :calling: Operadores Aritméticos

#### Anotações módulo 1 Estudonauta

Existe uma relação entre os operadores aritméticos e os comandos usados no Kotlin. Os comandos serão:

- Soma = o operador de adição (+) no Kotlin, sempre será convertido para o comando .plus(), que é a soma.

  ```
  println("$n1 + $n2 = ${n1 + n2}") // pode ser uma ou outra, o ideal é a de baixo
  println( println("$n1 + $n2 = ${n1.plus(n2)}"))
  ```



- Subtração = já na subtração (-) o comando será .minus()

  ```
  println("$n1 - $n2 = ${n1 - n2}")
  println( println("$n1 - $n2 = ${n1.minus(n2)}"))
  ```



- Multiplicação = na multiplicação (*) o comando será .times()

  ```
  println("$n1 * $n2 = ${n1 * n2}")
  println( println("$n1 * $n2 = ${n1.times(n2)}"))
  ```



- Divisão = na divisão (/) o comando será .div()

  ```
  println("$n1 / $n2 = ${n1.toFloat() / n2}")
  
  // a divisão funciona como inteiro ou real
  // para que seja mostrado os números após a vírgula,
  //é necessário fazer a conversão em um dos números
  
  println(println("$n1 / $n2 = ${n1.div(n2.toFloat())}"))
  ```



- Resto = no resto(%) o comando será 
  - .mod() se for inteiro
  
  - .rem() se for float (remanescente)
  
    ```
    println("$n1 % $n2 = ${n1 % n2}")
    println( println("$n1 % $n2 = ${n1.rem(n2)}"))
    ```
  
    
  
    
  
  ### :heavy_exclamation_mark: Operadores que precisam do pacote kotlin.math
  
- Raíz quadrada = .sqrt() 

  ```
  println("Raíz quadrada: ${sqrt(25f)} ")
  ```



- Potência = .pow() // power

  ```
  println("Potência: ${7f.pow(2)}")
  ```



- Arredondamento para cima = .ceil()

  ```
  println("Arredonda para cima: ${ceil(8.12f)}")
  ```



- Arredondamento normal para número inteiro = .roundToInt()

  ```
  println("Arredonda: ${8.49f.roundToInt()}")
  ```

  

- Arredondamento para baixo = .roundToFloor()

  ```
  println("Arredonda para baixo: ${ floor(8.8)}")
  ```





- Funções de extremo:

  - Elas verificam 2 valores e informam o maior ou menor valor, utilizando as funções:

    - .max()

      ```
      println("Maior: ${max(7 , 12)}")
      ```

    - .min()

      ```
      println("Menor: ${min(2 , 1)}")
      ```







