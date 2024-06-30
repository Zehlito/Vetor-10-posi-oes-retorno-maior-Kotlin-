//Faça um algoritmo que leia um vetor inteiro de 10 posições e retorne o maior valor do vetor
fun main() {
    val limits : Int = 10
    val myVector = IntArray(limits)
    var valorMaior : Int = myVector[0]

    for (i in 0..<limits)
    {
        print("Digite o valor para a posição [$i]: ")
        myVector[i] = readLine()!!.toInt()
    }
    for (i in 0..<limits)
    {
        if (myVector[i] > valorMaior)
        {
            valorMaior = myVector[i]
        }
    }
    println("O maior valor encontrado foi: $valorMaior")


}