fun main(args: Array<String>) {
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