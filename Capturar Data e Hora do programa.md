## :clock1: Capturar Data e Hora do programa

```
import java.time.LocalDateTime

fun main(){
    val dh = LocalDateTime.now()

    println("Dia atual: ${dh.dayOfMonth}")
    println("Mês atual: ${dh.monthValue}") // coloca o número do mês
    println("Ano atual: ${dh.year}")
    
    println("Hora atual: ${dh.hour}")
    println("Minuto atual: ${dh.minute}")
    println("Segundo atual: ${dh.second}")
}
```

