## :flags: Operadores de incremento de decremento

Basicamente a operação de incremento e decremento é somar uma unidade a ela ou subtrair uma unidade dela, sendo número inteiro.

Os operadores de incremento e decremento no Kotlin são os mesmos que a linguagem C.

- O operador ++ é similar ao .inc()

- O operador -- é similar ao .dec()

  - :bookmark_tabs: Exemplificando:

    - :heavy_plus_sign:  Opções de incremento:
      - n++
      - n = n+1
      - n = n.inc()
    - :heavy_minus_sign: Opções de decremento:
      - n--
      - n  = n -1
      - n = n.dec()

  - Operador n ++

    - ```
      var n:Int = 7
      
      n++ // n++ siginifica que o valor de n é acrescido por mais 1
      println("A variável tem o valor $n")
      ```

  - Operador .inc()

    - ```
      n.inc()
      	/* o n.inc() é realmente n + 1,
      	* porém o .inc() não altera a variável,
          * é necessário fazer uma atribuição, ficando assim:
          * n = n.inc()
          */
             
      // o n.in() sozinho não funciona como incremento, para que ele seja
      // um incremento é preciso ter a atribuição, como no exemplo acima.
      ```

### Diferenças entre as expressões n++ e ++n

Se estiverem sozinhos, não tem diferença, se estiverem dentro de uma expressão, os resultados serão diferentes.

O pós e pré determina se serão executados antes ou depois da sequência.

- n++ = significa que será um pós incremento

  - Exemplo:

    ```
    var x = 7
    var y = x++ // o y receberá o x, e somente depois será incrementado 1
    
    println("Os valores são $x e $y")
    
    Resultado na tela: Os valores são 8 e 7
    ```

- ++n = será um pré incremento

  - Exemplo:

    ```
    var x = 7
    var y = ++x // o y receberá o x, mas antes será incrementado 1
    
    println("Os valores são $x e $y")
    
    Resultado na tela: Os valores são 8 e 8
    ```