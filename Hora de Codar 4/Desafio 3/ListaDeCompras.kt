fun main(){

    var frutas = mutableListOf("Maçã", "Uva", "Morango", "Pera", "Manga")
    var i = true

    while(i){

        if(frutas.isEmpty()){
            println("\n-- Lista de compras finalizada! --")
            i = false
            break
        }
        println("\nDigite o nome da fruta que deseja comprar: ")
        var fruta = readln()

        val frutaEncontrada = frutas.find { it.equals(fruta, ignoreCase = true) }

        if(frutaEncontrada != null) {
            frutas.remove(frutaEncontrada)
            println("Fruta retirada da lista!")
        }
        else{
            println("Fruta não encontrada!")
        }
    }

}

