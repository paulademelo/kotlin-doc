## Números aleatórios

- Como sortear valores aleatórios:

No kotlin existe o conceito de intervalo, dentre uma quantidade de números, o programa escolhe um valor aleatório para mostrar na tela.

Exemplo:

```
var n = (0..50).random() // numa lista de 0 a 50, o comando .random() escolhe um.

print("O valor sorteado foi o: $n ")
```