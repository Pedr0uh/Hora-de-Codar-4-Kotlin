fun main(){

    val sistemaSolar = arrayOf("Mercúrio", "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    println("Insira o nome de um planeta: ")
    var planeta = readln()

    if(planeta in sistemaSolar){
        println("O planeta $planeta está presente no sistema solar.")
    }
    else{
        println("O planeta $planeta não está presente no sistema solar.")
    }


}