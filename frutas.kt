fun main() {
    //Reino do Kod
    val listaFrutas = mutableListOf("Maça","Banana","Laranja","Uva","Morango")
    //Adicionar uma nova fruta
    listaFrutas.add("Kiwi")
    //Remove uma fruta
    listaFrutas.remove("Uva")
    //Imprime cada fruta
    for(fruta in listaFrutas){
        println(fruta)
    }
    //Tamanho da Lista
    var tamanho: Int = listaFrutas.size
    println("Tamanho da lista: ${tamanho}")
}
