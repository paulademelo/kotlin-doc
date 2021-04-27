fun main(){
    //string crua
    println("""
    -----------------
    MENU PRINCIPAL
        [1] Novo
        [2] Editar
        [3] Apagar
        [4] Sair
    -----------------
""")

    // fazendo interpolação dentro de uma string crua

    var ano = 2021
    var nasc = 1995


    println("""
        <------------------------------>
        Olá! Tudo bem?
        Você nasceu em $nasc, certo?
        Atualmente estamos no ano de $ano.
        
        Calculando seus resultados...
        Terminei, pelos meus cálculos,
        você faz ${ano-nasc} anos até o final de $ano.
        
        É um prazer conhecer você! :D
        <------------------------------>
    """)

}