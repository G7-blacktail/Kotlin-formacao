fun main(args: Array<String>) {

    val pipoca = 5;
    val hotdog = 7;
    var client = 10;

        client += -8

     //   println("Pipoca disponível: " + pipoca)
     //   println("Hotdog disponível: "+ hotdog)
     //   println("Clientes na fila: " + client)

     println("Existem $client na fila")
     println("Há $pipoca disponível")
     println("Há $hotdog disponível")

    

    if (args.isNotEmpty()) {
        println("Argumentos fornecidos:")
        for (arg in args) {
            println(arg)
        }
    } else {
        println("Nenhum argumento fornecido.")
        println("Hello World Kotlin!")
    }

    // tipos primitivos em Kotlin
    client = client + 3;
        println("Adição explicita: $client clientes na fila")
    client += 7;
        println("Adição implicita: $client clientes na fila")
    client -= 5;
        println("Subtração implicita: $client clientes na fila")
    client *= 3;
        println("Multimplicação implicita: $client clientes na fila")
    client /= 2;
        println("Divisão implicita: $client clientes na fila")
    client %= 1
        println("Resto de divisão implicita: $client clientes na fila");

    // declarando tipos de váriaveis
    val d : Int
    val e : String

        d = 3
        e = "Iniciando váriavel";
    println("Aqui declarei duas variaveis: $d e $e");

    val inteiro : Int = 1000
    val palavra : String  = "log message"
    val pontoFlutuante: Double  = 3.14
    val longo : Long = 100_000_000_000_000
    val boleano : Boolean = false
    val caracter : Char = '\n' // caracter pode ser usado como scape, como caracter especial também!
        println("Todas as variaveis declaradas: $caracter $inteiro $caracter $palavra $caracter $pontoFlutuante $caracter $longo $caracter $boleano");

    /* 
    Coleções
    Listas somente leitura
    */
    val readOnlyShapes = listOf("Triangulo", "Retangulo", "Circulo");
        println("$caracter Aqui esta a lista criada: $caracter $readOnlyShapes");

    // Listas mutaveis com declaração explícita
    val shapes: MutableList <String> = mutableListOf("Triangulo", "Retangulo");
        println("$caracter Aqui está uma lista mutavel com declaração explícita: $caracter $shapes");

    // Fundição (lista apenas leitura)
    val shapes1: MutableList<String> = mutableListOf("triangle", "square", "circle");
    var shapesLocked: List<String> = shapes1;
        println("$caracter Exemplo de fundição: $caracter $shapesLocked $caracter");

    // Obtendo itens da lista
        println("O primeiro item da lista é : ${readOnlyShapes.first()}");
        println("Obtendo o último item da lista: ${shapesLocked.last()}");

    // Contando quantidade de itens na lista
        println("A quantidade de itens na lista readOnlyShapes é: ${readOnlyShapes.count()} itens $caracter");

    // pesquisando item na lista
        println("Circulo" in readOnlyShapes);
    
    // adicionando item a lista
    shapes.add("Pentágono");
        println(shapes);
    //removendo item da lista
    shapes.remove("Triangulo");
        println(shapes);

    // lista não ordenada
    // Somente leitura
    val readOnlyFruit = setOf("Maça", "Uva", "Banana", "Uva");
        println(readOnlyFruit);
    // Conjunto mutável com declaração explícita
    var fruta : MutableSet <String> = mutableSetOf("Abacaxi", "Laranja", "Cereja", "Cereja");
        println(fruta); 
    // Transformando em uma lista imutavél
    val fruitLocked: Set<String> = fruta;
        println("Lista imutavel: $fruitLocked");
        println("Na lista existem ${fruitLocked.count()} itens");
        println("Banana" in fruitLocked)
        fruta.add("Abacate");
        fruta.remove("Laranja");
        println("Apos adicionar e remover itens: $fruta ")

    // Mapas
    


}
