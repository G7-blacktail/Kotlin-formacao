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
    // Apenas leitura
    val readJuiceMenu = mapOf("Maça" to 100, "Kiwi" to 190, "Laranja" to 100);
        println("Menu de sucos disponíveis: $readJuiceMenu");
    // Mutavél
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("Maça" to 100, "Kiwi" to 190, "Laranja" to 100);
        println("Menu de sucos mutaveis: $juiceMenu");
    // Imutavel
    val juiceMenuLocked: Map<String, Int> = juiceMenu;
        println("Agora é imutavel: $juiceMenuLocked");
    // Acessando valores
        println("O valor do suco de laranja é: ${readJuiceMenu["Laranja"]}");
    // Contando a quantidade de itens no mapa
        println("Este mapa possui pares de valor-chave ${readJuiceMenu.count()}")
    // Adicionando e removendo itens do mapa
        juiceMenu.put("Coco", 150);
        juiceMenu.put("Acerola", 80);
        juiceMenu.remove("Laranja");
        println("Este é o menu após remover itens e adicionar itens: $caracter $juiceMenu");
    // Procurando um item especifico
        println(juiceMenu.containsKey("Kiwi"));
    // Obtendo só as chaves
        println(juiceMenu.keys)
    // Obtendo só os valores
        println(juiceMenu.values)
    // Verificando se está la lista
        // chave
        println("Laranja" in juiceMenu.keys);
        // valor
        println(200 in juiceMenu.values);

    println("-----------------------------------------------------------------------------------------------------------------------");

    // Condicionais (if and else)
    val a: Int;
    var check : Boolean = true;

        if(check) { a = 1}
        else { a = 6}

    println("A variavel 'a' é igual a: $a")

    // condição "ternária" em Kotlin
    val x = 2;
        println(if (a > x) a else x); // retornará o valor 2

    println("-----------------------------------------------------------------------------------------------------------------------");
    // Laço de repetição (When)
    var obj = "Hello";

        when(obj){
            //verifica se obj é igual a "1"
            "1" -> println("One");

            //Verifica se obj é igual a "Hello"
            "Hello" -> println("Greeting");

            // instrução padrão
            else -> println("Unkown");
        }

        // atribuindo a condição diretamente a uma váriavel

    var obj2 = "World";

    var result = when(obj2){
        "2" -> "Um"
        "World" -> "Greeting"
        else -> "Não encontrado"
    }
        println(result);
    
    // Verificando uma cadeia de booleanos com when
    val temperadura = 18;

        val description = when{
            temperadura < 0 -> "Muito frio"
            temperadura < 10 -> "Um pouco frio"
            temperadura < 20 -> "Quente"
            else -> "Muito quente"
        }

        println(description);
        println("-----------------------------------------------------------------------------------------------------------------------");

        // loops
        for (numbers in 1..5){
            println(numbers)
        }

        val bolos = listOf("Cenoura", "Queijo", "Chocolate");
            for(bolo in bolos){
                println("Que delícia, é um bolo de $bolo !");
            }

        println("-----------------------------------------------------------------------------------------------------------------------");

        var bolosComidos = 0;
            while(bolosComidos < 3){
                println("Coma um bolo");
                bolosComidos++;
            }

        println("-----------------------------------------------------------------------------------------------------------------------");

        // do-while
        var cakesEaten = 0;
        var cakesBaked = 0;

            while(cakesEaten < 3){
                println("Eat cakes");
                cakesEaten++;
            }

            do{
                println("Bake cake");
                cakesBaked++;
            } while (cakesBaked < cakesEaten);
}
