## :triangular_flag_on_post: Operadores Lógicos

Operadores de atribuição do Kotlin:

Na lógica de programação a ideia dos operadores costuma ser assim:

a+=b (significa que a recebe a + b ou a = a+b)

x /= 5 (significa que x recebe x dividido por 5 ou x = x/5)

No kotlin esse tipo de operação utilizamos:

```
Operadores de atribuição:
- += .plusAssign()
- -= .minusAssign()
- *= .timesAssign()
- /= .divAssign()
- %= .modAssign()
```



Exemplo: 

```
var n:Int = 5

n += 2 // essa operação significa que tv recebe tv + 3 --> tv = tv + 3
println(n)

n %= 2 // n = n % 2
println(n)

n *= 2 // n = n * 2
println(n)

// aqui declara como float pq o 5/2 não será inteiro
// ficando assim: n:Float = 5
n /= 2 // n = n/2
println(n)
```

