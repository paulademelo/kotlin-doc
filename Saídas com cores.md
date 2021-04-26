### :art: Saídas com cores :rainbow:

Como montar um código de cores no comando do Kotlin utilizando o ANSI

a estrutura básica do código ANSI é assim:

- \u001b[ aqui vão dois dígitos]m

  - esses dois dígitos que serão colocados entre as barras, vão de 30 até 37

  - Respectivas cores: 

    00 - reset é o código que retorna a cor padrão do terminal ficando assim: \u001b[00]m 

    30 - preto ---> \u001b[30]m :black_flag:

    31 - vermelho ---> \u001b[31]m :red_circle:

    32 - verde  ---> \u001b[32]m :green_heart:

    33 - amarelo  ---> \u001b[33]m :yellow_heart:

    34 - azul  ---> \u001b[34]m :blue_heart:

    35 - magenta  ---> \u001b[35]m :ribbon:

    36 - ciano  ---> \u001b[36]m :man_playing_water_polo:

    37 - branco  ---> \u001b[37]m :white_flag:

- Basta colocar este código dentro da string que ela ficará com a respectiva cor.

  - ex:

    ```
    println("\u001B[33m É um prazer conhecer você! :D]")
    ```

```
    // UTILIZANDO CORES NO TERMIANAL

    val RESET:String = "\u001B[00m"
    val PRETO:String = "\u001B[30m"
    val VERMELHO:String = "\u001B[31m"
    val VERDE:String = "\u001B[32m"
    val AMARELO:String = "\u001B[33m"
    val AZUL:String =  "\u001B[34m"
    val MAGENTA:String = "\u001B[35m"
    val CIANO:String = "\u001B[36m"
    val BRANCO:String = "\u001B[37m"

println("${VERMELHO}É ${AMARELO} um ${VERDE} prazer ${AZUL}conhecer ${CIANO} você! :D]")


}
```
