fun main(){

    var listaAlunos = mutableListOf<String>()

    println(" --- Cadastro de Alunos ---")

    println("Deseja cadastrar um aluno? (S/N)")
    var resposta = readln()

    while(resposta.equals("S", ignoreCase = true)){
        println("Digite o nome do aluno:")
        val nome = readln()
        listaAlunos.add(nome)
        println("Deseja cadastrar outro aluno? (S/N)")
        resposta = readln()
        if(resposta.equals("S", ignoreCase = true)){
            continue
        }
        else if(resposta.equals("N", ignoreCase = true)){
            break
        }
        else{
            println("Resposta inválida. Digite S para sim ou N para não.")
            resposta = readln()
        }
    }

    println("Alunos cadastrados: ${listaAlunos.size}")
    println(listaAlunos)


}