## :loudspeaker: Operadores Lógicos

No Kotlin existem três operadores lógicos, são eles:

- && = conjunção (e ^)

  - Utilizando a tabela verdade:

    | A    | B    | A && B |
    | ---- | ---- | ------ |
    | V    | V    | V      |
    | V    | F    | F      |
    | F    | V    | F      |
    | F    | F    | V      |

    * Só será verdade se ambas forem verdadeiras

      

- || = disjunção (ou v)

  | A    | B    | A && B |
  | ---- | ---- | ------ |
  | V    | V    | V      |
  | V    | F    | V      |
  | F    | V    | V      |
  | F    | F    | F      |

  	-  Basta que um seja verdadeiro que a sentença será verdadeira.

  

- ! = negação (~)

  | A    | !A   |
  | ---- | ---- |
  | V    | F    |
  | F    | V    |

  

### :orange_book: Ordem de precedência dos operadores

A ordem de precedência sempre será de cima para baixo, observando a ordem:

1- parênteses

2 - aritméticos

3 - relacionais

4 - lógicos

 - sequência dos operadores lógicos:
   	- 1 - ! (~ negação)
   	- 2 - && (^ e)
   	- 3 - || (v ou)

