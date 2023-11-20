fun main(args: Array<String>) {

    val pipoca = 5;
    val hotdog = 7;
    var client = 10;

        client += -8

        println("Pipoca disponível: " + pipoca)
        println("Hotdog disponível: "+ hotdog)
        println("Clientes na fila: " + client)

    

    if (args.isNotEmpty()) {
        println("Argumentos fornecidos:")
        for (arg in args) {
            println(arg)
        }
    } else {
        println("Nenhum argumento fornecido.")
        println("Hello World Kotlin!")
    }
}